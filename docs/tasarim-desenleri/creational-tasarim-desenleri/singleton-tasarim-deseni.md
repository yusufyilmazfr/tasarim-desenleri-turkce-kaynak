> Bir sınıfın sadece bir örneği olmalıdır ve bu örneğe global bir erişim noktası sağlanmalıdır.

![singleton-design-pattern](../../../images/singleton.png)

Desene ait yukarıdaki diyagrama bakacak olursak, örneğini istediğimiz sınıfın;

1. Constructor (oluşturucu metotu) `private `olmalıdır. Bunun amacı nesne oluşumunu tek yerden sağlamak. İstemcinin, `new` anahtar kelimesini kullanması engellemektir.
2. `Static bir değişken` olmalıdır, referansı tutmak için.
3. Tutulan referansa erişmek için bir metot olmalıdır, `getInstance()`

C# Kod Örneği:

```csharp
class Database
{
    private static Database database;

    private Database()
    {

    }

    public static Database GetInstance()
    {
        if (database == null)
        {
            database = new Database();
        }

        return database;
    }
}
```

```csharp
Database firstInstanceRequest = Database.GetInstance();
Database secondInstanceRequest = Database.GetInstance();

firstInstanceRequest == secondInstanceRequest // true
```

Desenin yukarıdaki durumu geçerli gibi duruyor fakat multi-thread uygulamalarda nesnenin daha örneğinin oluşmadığı esnada `if (database == null)` durumuna aynı anda birden fazla thread girebilir, bu sayede de o sınıfa ait birden fazla nesne örneği bulunur. Bu kısmı iyileştirme yolunda dillerin bize sağladığı yapıları kullanabiliriz. C# dilinde `lock` ile JAVA dili için de `synchronized` sayesinde aynı anda sadece bir yapının erişmesini sağlarız. 

C# dili için `GetInstance()` metotunu düzenleyecek olursak aşağıdaki hali alacaktır.

```csharp
public class Database
{
    private static Database database;
    private static Object _lockObject = new object();
    
    private Database()
    {

    }

    public static Database GetInstance()
    {
        if (database == null)
        {
            lock (_lockObject)
            {
                if (database == null)
                {
                    database = new Database();
                }
            }
        }

        return database;
    }
}
```

  *Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını [bu tasarım deseni için oluşturulmuş klasörde](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/tree/master/singleton) bulabilirsiniz.*