> Prototype tasarım deseni, mevcut nesnelerin prototiplerinin oluşturulmasını yani nesnelerin kopyalarını elde etmeyi sağlayan bir tasarım desenidir.

Prototip deseninin tasarlanmasının asıl sebebi, ilgili nesne üzerinden aynı tipte başka bir nesneyi hızlıca üretebilmektir. Haliyle üretimi esnasında maliyetli olabilecek nesneleri(ki burada maliyetten kasıt parametreli constructer vs. olabilir) var olan nesne üzerinden `new` anahtar sözcüğünü kullanmadan bir şekilde oluşturulmasını sağlayabilmektedir.

`Shallow Copy` ve `Deep Copy` olmak üzere iki tür nesne kopyalama işlemi mevcuttur.

`Shallow Copy` ile nesnelerin bellekteki adresleri kopyalanmaktadır, dolayısıyla yüzeysel olarak bir kopyalama işlemi gerçekleştirileceği için yeni bir nesne üretilmemekte, var olan nesne üzerine referanslar ile işaretleme yapılmaktadır. Bundan dolayı **Shallow Copy, Prototype Design Pattern için uygun tercih olmayacaktır.**

`Deep Copy` ile nesneler birebir kopyalanabilmekte ve bu kopya sonucu ile asıl nesne farklı referanslar ile işaretlenebilmektedir. Prototype Design Pattern’de bu kopyalama yaklaşımında bulunmak en doğrusudur.

![prototype-uml](../../../images/prototype-uml.png)

JAVA Kod Örneği:

```java
// Klonlamak istediğimiz sınıflarımıza uygulayacağımız arayüz.
// Farklı sınıflarda da kullanılması için Generic bir yapı oluşturuldu.
// Generic yapı sayesinde dinamik olarak tip dönüşümü sağlanacaktır.
// Bu sayede farklı sınıflara da bu deseni uygulama şansı doğuyor.
interface IClonablePrototype<TPrototype> extends Cloneable {
    TPrototype clone() throws CloneNotSupportedException;
}
```

```java
// Employee sınıfına klonlama yeteneği kazandırmak için tanımladığımız
// arayüzü uyguladık.
public class Employee implements IClonablePrototype<Employee> {
    String firstName;
    String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}
```

```java
Employee gulizar = new Employee("Gülizar", "Yılmaz");

Employee cloneGulizar = gulizar.clone();


// Aynı nesne örneklerini farklı referanslarda tutuyor.
// Birbirinin aynısı ve farklı referanslarda olan nesneler elde ettik.
System.out.println(gulizar == cloneGulizar); //output: false
```

---

C# Kod Örneği:

```csharp
// Klonlamak istediğimiz sınıflarımıza uygulayacağımız arayüz.
// Farklı sınıflarda da kullanılması için Generic bir yapı oluşturuldu.
// Generic yapı sayesinde dinamik olarak tip dönüşümü sağlanacaktır.
// Bu sayede farklı sınıflara da bu deseni uygulama şansı doğuyor.
interface IClonablePrototype<TPrototype>
{
    TPrototype Clone();
}
```

```csharp
// Employee sınıfına klonlama yeteneği kazandırmak için tanımladığımız 
// arayüzü uyguladık.

class Employee : IClonablePrototype<Employee>
{
    string firstName;
    string lastName;

    public Employee(string firstName, string lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee Clone()
    {
        return base.MemberwiseClone() as Employee;
    }
}
```

```csharp
Employee gulizar = new Employee("Gülizar", "Yılmaz");
Employee cloneGulizar = gulizar.Clone();

// Aynı nesne örneklerini farklı referanslarda tutuyor.
// Birbirinin aynısı ve farklı referanslarda olan nesneler elde ettik.
Console.WriteLine(gulizar == cloneGulizar); //output: false
```

*Bu tasarım deseninin diğer diller için olan uygulamasını [bu tasarım deseni için oluşturulmuş klasörde](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/tree/master/prototype) bulabilirsiniz.*