> Proxy tasarım deseni, istemcinin orijinal nesneye direkt erişimi yerine bu erişimi nesneyi temsil eden proxy (vekil) sınıflar üzerinden gerçekleştirmesini ve bu proxy (vekil) sınıfların sunduğu imkanları kullanmasını sağlayan tasarım desenidir.

Uygulama boyunca belirli bir işlemlerimizi yerine getiren sınıflarımız mevcuttur. Sınıf örneklerimizi kullanırken kimi işlemleri kontrol etmek gerekiyor. Bu kontroller, erişimin kısıtlı olması gibi işlemler olabilir. Bunların yanı sıra oluşturulması maliyetli olan nesnelerin birden fazla oluşturulmamasının kontrolü ya da o nesneye erişmeden önce güvenlik gereği işlemlerin kayıt altına alınması gibi işlemler de gerçekleştirilebilir. Proxy tasarım deseni, buradan bizlere gerçek nesneye erişmeden önce gerekli işlemleri yapmamızı sağlar. Aşağıda bu tasarım desenine ait UML diyagramı görülmektedir.

 ![proxy-uml](../../../images/proxy-uml.png)

- **Service:** Operasyonel işlemlerin tanımlandığı arayüzdür. İstemci bu arayüz ile ilgilenmektedir.

- **ConcreteService:** Gerçek işleri yapan, istemcinin direkt erişmesini istemediğimiz sınıftır.

- **ProxtService:** İstemcinin muhatabı olacağı sınıftır, `ConcreteService`  sınıfına direkt erişimi engeller ve bu sınıf örneğinin referansını tutar.

Senaryo olarak COVID-19 virüsünden dolayı maske siparişi verildiğini ve maske siparişi verilmeden önce vatandaşa ait T.C kimlik numarası ve adres doğrulamasının yapıldığı düşünülsün.

C# Kod Örneği:

```csharp
// Sipariş işlemlerini gerçekleştiren sınıflar tarafından uygulanan arayüz.
// UML diyagramındaki Service arayüzüne denk gelmektedir.
interface IOrderableMask
{
    void CreateOrder(Person person);
}
```

```csharp
// Maske siparişininin oluşturulduğu sınıf.
// İstemcinin direkt erişmesini istemediğimiz alandır.
// UML diyagramındaki ConcreteService sınıfına denk gelmektedir.
class MaskOrder : IOrderableMask
{
    public void CreateOrder(Person person)
    {
        // Burada siparişin oluşturulma işlemleri yer alacaktır.

        Console.WriteLine($"Order created to {person.Address}.");
    }
}
```

```csharp
// İstemcinin muhatap olacağı sınıftır.
// Proxy sınıfımızdır.
// Gerçek işi yapan MaskOrder sınıfının referansını tutar.
// Sipariş verilmeden önce vatandaşın bilgilerinin kontrolü yapılır.
class AuthenticatableMaskOrderProxy : IOrderableMask
{
    private IOrderableMask _orderMask;

    public AuthenticatableMaskOrderProxy()
    {
        _orderMask = new MaskOrder();
    }

    public void CreateOrder(Person person)
    {
        // Sipariş oluşturulmadan önce kimlik kontrolü yapılıyor.
        bool isValid = CheckPersonIsValid(person);

        if (isValid)
        {
            _orderMask.CreateOrder(person);
        }
    }

    private bool CheckPersonIsValid(Person person)
    {
        // Burada Mernis servisleri ile iletişim sağlanabilir.
        // Örnek amaçlı TC numarasının 11 karakter olması yeterlidir. 
        // Örnek amaçlı adres alanının boş olmaması yeterlidir. 
        return person.TC.Length == 11 && person.Address != "";
    }
}
```

```csharp
// Maske siparişini verecek kullanıcıları temsili sınıf.
class Person
{
    public string TC { get; set; }
    public string Address { get; set; }

    public Person(string tc, string address)
    {
        TC = tc;
        Address = address;
    }
}
```

```csharp
Person semanur = new Person("11111111111", "İstanbul/Sancaktepe xxx-yyy-zzz");

IOrderableMask orderableMask = new AuthenticatableMaskOrderProxy();
orderableMask.CreateOrder(semanur);

// output: Order created to İstanbul/Sancaktepe xxx-yyy-zzz.
```

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını [bu tasarım deseni için oluşturulmuş klasörde](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/tree/master/proxy) bulabilirsiniz.*