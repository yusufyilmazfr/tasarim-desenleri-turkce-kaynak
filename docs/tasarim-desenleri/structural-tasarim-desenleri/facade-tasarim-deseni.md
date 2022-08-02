> Facade tasarım deseni, bir alt sistemdeki arayüzlere bir birleşik arayüz sağlayarak alt sistemin kullanımını daha kolay hale getirmeyi amaçlar.

Bu desendeki amaç karmaşık iş süreçlerini saklamaktır. Bunların yanı sıra algoritmalar, iş süreçleri vs. pek çok nesneden hizmet alarak ilerleyebilir. Bu detaylı bilgiler de bir nevi istemciden soyutlanmış olur.

Özetle: **amaç sistemi yeni bir alt yapıya sokmak değil, alt sınıflardaki karmaşıklığı soyutlayarak pratiklik sunmaktır.**

Senaryo olarak bir bankanın müşterilerine kredi kartı verdiklerini, bu kredi kartı verme işlemlerinden önce ise kendi iş kurallarını uyguladığını kabul edelim. Kodun kalabalık olmaması için temel olarak müşteriye kredi kartı vermeden önce kara listede olup olmadığı kontrol ediliyor olsun.

C# Kod Örneği:

```csharp
// Banka müşterimizi temsili oluşturan sınıf
class Customer
{
    public Customer(string firstName, string lastName)
    {
        FirstName = firstName;
        LastName = lastName;
    }

    public string FirstName { get; set; }
    public string LastName { get; set; }
}
```

```csharp
// Kara liste ile ilgili işlemlerin yapıldığı sınıf
class BlackListService
{
    public bool CheckEmployeeIsTheBlackList(Customer customer)
    {
        // Müşterinin kara listede olup olmadığının kontrolünün yapıldığı yer.
        // Kara listede ise false, değilse true dönmekte olduğunu var sayalım.
        // Burada veri tabanı kodları ya da harici bir servis ile iletişim sağlanabilir.
        // Default olarak true döndürdük.
        return true;
    }
}
```

```csharp
// Kredi kartı ile ilgili işlemlerin yapıldığı sınıf
class CreditCardManager
{
    public void CreateCreditCart(Customer customer)
    {
        // Parametre olarak gelen kullanıcıya ait kredi kartı oluşturma işleminin yapıldığı yer
    }
}
```

```csharp
// İstemci tarafından gerekli işlemlerin yapılması.
Customer duygu = new Customer("Duygu", "Kaya");

CreditCardManager creditCardManager = new CreditCardManager(); ;
BlackListService blackListService = new BlackListService();

if (blackListService.CheckEmployeeIsTheBlackList(duygu))
{
    creditCardManager.CreateCreditCart(duygu);
}
```

Yukarıdaki koda baktığımız zaman istemci tarafında önce müşterinin kara listede olup olmadığı kontrolü yapıldı daha sonra ise duruma göre kredi kartı oluşturması sağlandı. Buraya kadar pek de bir şey yok, çünkü bir adet kontrol var fakat tahmin edileceği üzere banka işlemlerinde birden fazla operasyonel işlem mevcut. Bu işlemlerin kalabalıklığından doğacak problemler arasında;

- Başka bir yerde kredi kartı oluşturulmak istendiğinde buradaki kodların aynısının oraya da yazılmasından kaynaklı kod kalabalığı olacaktır.
- İstemci tarafında bu işlemler gerçekleştiği için geliştiricinin bu doğrulama süreçlerini iyi ve eksiksiz takip etmesi gerekiyor olacak.
- Olası bir değişimde birden fazla yerde değişiklik yapması durumunda kalınacaktır.

Yukarıdaki temel nedenler olayın anlaşılması için yeterlidir.

Bu karmaşıklığın önüne geçmek için `Facade` tasarım deseni uygun bir çözümdür. Aşağıda bu desene ait UML diyagramı görülmektedir.

![facade-uml](../../../images/facade-uml.png)

Yukarıdaki UML diyagramından esinlenerek kredi kartı işlemlerindeki karmaşıklığı `CreditCardFacade` adında oluşturduğumuz sınıf içerisinde gizleyebiliriz. Kodumuz aşağıdaki gibi olacaktır.

C# Kod Örneği:

```csharp
// Banka müşterimizi temsili oluşturan sınıf.
class Customer
{
    public Customer(string firstName, string lastName)
    {
        FirstName = firstName;
        LastName = lastName;
    }

    public string FirstName { get; set; }
    public string LastName { get; set; }
}
```

```csharp
// Kara liste ile ilgili işlemlerin yapıldığı sınıf
class BlackListService
{
    public bool CheckEmployeeIsTheBlackList(Customer customer)
    {
        // Müşterinin kara listede olup olmadığının kontrolünün yapıldığı yer.
        // Kara listede ise false, değilse true dönmekte olduğunu var sayalım.
        // Burada veri tabanı kodları ya da harici bir servis ile iletişim sağlanabilir.
        // Default olarak true döndürdük.
        return true;
    }
}
```

```csharp
//Kredi kartı ile ilgili işlemlerin yapıldığı sınıf
class CreditCardManager
{
    public void CreateCreditCart(Customer customer)
    {
        // Parametre olarak gelen kullanıcıya ait kredi kartı oluşturma işleminin yapıldığı yer
    }
}
```

```csharp
class CreditCardFacade
{
    public void CreateCreditCart(Customer customer)
    {
        CreditCardManager creditCardManager = new CreditCardManager(); ;
        BlackListService blackListService = new BlackListService();

        if (blackListService.CheckEmployeeIsTheBlackList(customer))
        {
            creditCardManager.CreateCreditCart(customer);
        }
    }
}
```

```csharp
Customer duygu = new Customer("Duygu", "Kaya");

CreditCardFacade creditCardFacade = new CreditCardFacade();
creditCardFacade.CreateCreditCart(duygu);
```

Bu sayede kod kalabalığının önüne geçilmiş olundu bunun da yanı sıra eklenecek yeni bir iş kuralında istemci tarafından herhangi bir değişikliğe gidilmemesi olumlu bir artı olarak geliyor.

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını [bu tasarım deseni için oluşturulmuş klasörde](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/tree/master/facade) bulabilirsiniz.*