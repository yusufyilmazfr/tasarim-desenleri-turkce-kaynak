> Yapılarımız (sınıf, metot, fonksiyon) gelişime açık değişime kapalı olmalıdır.

Yazılımlar için zamanla değişim şüphesiz kaçınılmazdır; değişen iş kuralları, kullanılan harici kütüphaneler gibi başlıca nedenler örnek gösterilebilir. Bu prensibin anlatmak istediği şey **yeni bir davranış ya da özellik eklemek istediğimiz durumda; yapmak istediğimiz değişikliği mevcut koda dokunmadan, değişimi sadece yeni kodlar üzerinden sağlamaktır.**

![open-closed](../../images/open-closed.png)

JAVA Kod Örneği:

```java
class Employee {
    ...
}

class EmployeeManager {
    public void addEmployee(Object database, Employee employee) {
        if (database instanceof OracleDatabase) {
            ((OracleDatabase) database).addDatabase(employee);
        }
    }
}

class OracleDatabase {
    public void addDatabase(Employee employee) {
        ...
    }
}
```

Yukarıdaki koda ve diyagrama baktığımız zaman `EmployeeManager` adında bir sınıfımız mevcut ve gelen `Employee` sınıfına ait nesneyi veri tabanına kayıt ediyor. Veri tabanına kayıt etmeden önce hangi veri tabanı örneği geldiğini de `if-else` durumlarında kontrol edip tip dönüşümü sağlamaktadır. Yukarıdaki kod örneği maalesef `Open-Closed` için uygun değildir. Nedeni ise yeni bir veri tabanı eklenmek istediğinde başka bir `if-else` durumu açılacaktır, yeni eklenen veri tabanı kontrolü sağlanacaktır ve sürekli mevcut koda bir müdahalede bulunulacaktır. **Bunu çözmenin yolu ise genelde soyutlamadan geçmektedir.**

Yukarıdaki UML diyagramını biraz daha düzenlersek aşağıdaki gibi bir yapı elde edilir. Yeni bir eklemede mevcut koda dokunmaya gerek kalmıyor bu sayede. Kayıt işlemlerini `MySQL` üzerinde yapmak istediğimiz zaman `MySQLDatabase` adında bir sınıf oluşturup `IDatabase` arayüzünü uygulamamız yeterlidir. 🥰

![open-closed-2](../../images/open-closed-2.png)

JAVA Kod Örneği:

```java
class Employee { 
...
}

interface IDatabase {
    void addDatabase(Employee employee);
}

class EmployeeManager {
    public void addEmployee(IDatabase database, Employee employee) {
        database.addDatabase(employee);
    }
}

class OracleDatabase implements IDatabase {
    @Override
    public void addDatabase(Employee employee) {
       ...
    }
}
```