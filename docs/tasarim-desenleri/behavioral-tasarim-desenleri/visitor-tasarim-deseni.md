> Visitor tasarım deseni, üzerinde çalıştığımız nesnelerin sınıflarını değiştirmeden yeni bir özellik tanımlamamızı sağlayan bir tasarım desenidir.

İşlem yapılacak nesnelerde herhangi bir değişiklik yapılmaz. İşlemi ziyaretçi (Visitor) nesneleri yapar. Eğer sisteme yeni nesneler eklenmiyor, fakat sık sık yeni işlemlerin eklenmesi gerekiyorsa bu tasarım deseni kullanılabilir. Bu tasarım deseninin kullanılmasıyla, yapılacak işlemle ilgili kodların merkezi bir nesnede toplanır.

Bu tasarım desenine ait UML diyagramı aşağıdaki gibidir.

![visitor-uml](../../../images/visitor-uml.png)

- **Visitor:** Her `ConcreteVisitor` örneği için metot temsil eder, parametre olarak `Element ` sınıfından türeyen sınıfların örneğini alır. 

- **ConcreteVisitor:** `Visitor` arayüzünü ve burada tanımlı olan metotları uygular. Sonradan eklenmek istenen işlemler burada yer alır.

- **Element:** `ConcreteElement`  sınıfı örneklerinin ortak bir parametre olarak gitmesi için yapılan soyutlamadır.

- **ConcreteElement:** `Element` sınıfından türer. `accept` metoduna bulunduğu nesne örneği gönderilir.

Senaryo olarak elimizde kitaplarımızın olduğunu ve bu kitap bilgilerinin farklı şekillerde XML ya da JSON gibi çıktılarının alındığını düşünelim.

C# Kod Örneği:

```csharp
// Temel sınıftır.
// Yeni davranışları Accept metotu ile alır.
// UML diyagramındaki Element yapısına denk gelmektedir.
abstract class Book
{
    public string name;
    public string author;
    public string categoryName;

    public abstract void Accept(IBookExportVisitor visitor);
}
```

```csharp
// UML diyagramındaki Element'ten türer.
// Accept metoduna bulunduğu nesne örneği gönderilir.
// UML diyagramındaki ConcreteElement yapısına denk gelir.
class Encyclopedia : Book
{
    public override void Accept(IBookExportVisitor visitor)
    {
        visitor.ExportVisit(this);
    }
}
```

```csharp
// UML diyagramındaki Element'ten türer.
// Accept metoduna bulunduğu nesne örneği gönderilir.
// UML diyagramındaki ConcreteElement yapısına denk gelir.
class Magazine : Book
{
    public override void Accept(IBookExportVisitor visitor)
    {
        visitor.ExportVisit(this);
    }
}
```

```csharp
// Her ConcreteVisitor örneği için metot temsil eder.
// Parametre olarak Element sınıfından türeyen sınıfların örneğini alır.
// UML diyagramındaki Visitor yapısına denk gelir.
interface IBookExportVisitor
{
    void ExportVisit(Magazine magazine);
    void ExportVisit(Encyclopedia encyclopedia);
}
```

```csharp
// Visitor arayüzünü ve burada tanımlı olan metotları uygular.
// Sonradan eklenmek istenen işlemler burada yer alır.
// UML diyagramındaki ConcreteVisitor yapısına denk gelir.
class XmlExportVisitor : IBookExportVisitor
{
    public void ExportVisit(Magazine magazine)
    {
        // Parametre olarak gelen örneğin XML'e çevrilmesi işlemleri yer alacaktır.
        Console.WriteLine($"{magazine.name} exported by XmlExportVisitor");
    }

    public void ExportVisit(Encyclopedia encyclopedia)
    {
        // Parametre olarak gelen örneğin XML'e çevrilmesi işlemleri yer alacaktır.
        Console.WriteLine($"{encyclopedia.name} exported by XmlExportVisitor");
    }
}
```

```csharp
// Visitor arayüzünü ve burada tanımlı olan metotları uygular.
// Sonradan eklenmek istenen işlemler burada yer alır.
// UML diyagramındaki ConcreteVisitor yapısına denk gelir.
class JsonExportVisitor : IBookExportVisitor
{
    public void ExportVisit(Magazine magazine)
    {
        // Parametre olarak gelen örneğin JSON'a çevrilmesi işlemleri yer alacaktır.
        Console.WriteLine($"{magazine.name} exported by JsonExportVisitor");
    }

    public void ExportVisit(Encyclopedia encyclopedia)
    {
        // Parametre olarak gelen örneğin JSON'a çevrilmesi işlemleri yer alacaktır.
        Console.WriteLine($"{encyclopedia.name} exported by JsonExportVisitor");
    }
}
```

```csharp
Book earth = new Encyclopedia();

earth.name = "Big Earth!";
earth.author = "Jose S. Massey";
earth.categoryName = "Encyclopedia";

Book daily = new Magazine();

daily.name = "Daily Magazine";
daily.author = "Wayne D. Eakin";
daily.categoryName = "Magazine";


IBookExportVisitor xmlExportVisitor = new XmlExportVisitor();
IBookExportVisitor jsonExportVisitor = new JsonExportVisitor();

earth.Accept(xmlExportVisitor);
daily.Accept(jsonExportVisitor);

// output:
//  Big Earth!exported by XmlExportVisitor
//  Daily Magazine exported by XmlExportVisitor
```

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını [bu tasarım deseni için oluşturulmuş klasörde](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/tree/master/visitor) bulabilirsiniz.*