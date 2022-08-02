> Bir sınıfın arayüzünü istemcinin beklediği arayüze çevirmeye yarar.

Farklı sistemleri kendi sistemimize dahil ederken bazen yapılar uyuşmayabiliyor. Buradaki yapılar arayüzler olabilir. Bu desenin amacı arayüz için bir adapter oluşturarak sanki kendi sistemimize aitmiş gibi çalıştırmayı sağlar. Özetle; **uyumsuz bir yapıyı, istemcinin beklediği bir yapıya getirir.**

![adapter-uml](../../../images/adapter-uml.png)

- **Adaptee:** Mevcut sisteme uygulanmak istenen sınıf.

- **Adapter:** Mevcut sisteme uygulama işlemini yapan sınıf.

- **Target:** Sistemde kullanılan yapı. (Abstract, Interface vs.)

Geliştirdiğimiz uygulamada JSON işlemleri için sistemimizin `IJsonSerializer` arayüzünü kullandığını düşünelim. İlerleyen süreçte bu işlemleri gerçekleştirmek için 3. parti bir yazılım kullanmak istediniz  fakat daha sonradan eklediğiniz yapı sisteminiz ile uyumsuz çünkü sistem `IJsonSerializer` arayüzünü uyguluyor fakat yeni gelen yapı bunu uygulamamaktadır ve yeni gelen yapıya da müdahalede bulunamıyorsunuz. Bu sorunu adapter ile aşağıdaki gibi çözüme götürebiliriz.

C# Kod Örneği:

```csharp
// UML diyagramındaki Target'a denk gelmektedir.
// Sistem bu arayüzü uygulayarak çalışmaktadır.
interface IJsonSerializer
{
    public string SerializeObject(object obj);
}
```

```csharp
// Sisteme daha sonradan dahil olan yapı.
// Sistemin kullandığı arayüzü uygulamamaktadır.
// UML diyagramındaki Adaptee'ye denk gelmektedir.
class CustomSerializer
{
    public string Serialize(object obj)
    {
        // Gelen nesneyi serilize etmek için temel operasyonel işlemler..
        // Daha sonradan da gerekli değerin geri döndürülmesi...
        return "serialized with CustomSerializer";

    }
}
```

```csharp
// Daha sonradan dahil edilen yapının sisteme adepte edilmesi işlemi.
// Sistemin kullandığı arayüzü uygular.
// Bu sayede IJsonSerializer'i uygulayan bir sınıf örneği istendiğinde
// bu sınıf örneğini vererek mevcut koda dokunmadan sistemin devam etmesi
// sağlaır.
// UML diyagramındaki Adapter'a denk gelmektedir.
class CustomSerializerAdapter : IJsonSerializer
{
    public string SerializeObject(object obj)
    {
        CustomSerializer customSerializer = new CustomSerializer();
        return customSerializer.Serialize(obj);
    }
}
```

```csharp
class CustomOperation
{
    private IJsonSerializer _jsonSerializer;

    public CustomOperation(IJsonSerializer jsonSerializer)
    {
        _jsonSerializer = jsonSerializer;
    }

    public string SerializeObject(object obj)
    {
        return _jsonSerializer.SerializeObject(obj);
    }
}
```

```csharp
var customOperation = new CustomOperation(new CustomSerializerAdapter());

string serializedObject = customOperation.SerializeObject(new object());

Console.WriteLine(serializedObject); // output: serialized with CustomSerializer
```

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını [bu tasarım deseni için oluşturulmuş klasörde](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/tree/master/adapter) bulabilirsiniz.*