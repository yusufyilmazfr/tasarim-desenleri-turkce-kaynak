> Observer tasarım deseni, bir nesnede meydana gelen değişikliği içinde bulunduğu listedeki tüm elemanlara bildiren tasarım desenidir.

Aşağıda bu tasarım desenine ait UML diyagramı bulunmaktadır.

![observer-uml](../../../images/observer-uml.png)

- **Observer:** Değişimden etkilenecek, izleyecek olan sınıfların uyguladığı arayüzdür. Duruma göre soyut sınıf (abstract class) da olabilir.

- **ConcreteObserver:** Observer arayüzünü uygulayan, değişimi takip eden sınıflardır. Değişim `update` metotu ile bildirilir. 

- **Observable:** Takip edilecek olan yapımızdır. İçerisinde `Observer` (değişimden etkilenecek) nesneleri tutar.

- **ConcreteObservable:** `Observer` sınıfından türerler.

Senaryo olarak kullanıcılarımızın olduğunu ve bu kullanıcıların fiyatını takip ettiği bir ürün olduğunu farz edelim. Ürün fiyatı değiştikten sonra takip eden kullanıcılara bir mesaj gittiğini düşünelim.

C# Kod Örneği:

```csharp
// Değişimden etkilenecek, izleyecek olan sınıfların uyguladığı arayüzdür.
// UML diyagramındaki Observer yapısına denk gelmektedir.
interface IObserverUser
{
    void SendNotification(ProductUpdateMessage message);
}
```

```csharp
// Observer arayüzünü uygulayan, değişimi takip eden sınıflardır.
// Değişim update metotu ile bildirilir.
// UML diyagramındaki ConcreteObserver yapısına denk gelmektedir.
class ObserverUser : IObserverUser
{
    public void SendNotification(ProductUpdateMessage message)
    {
        Console.WriteLine(message.ToString());
    }
}
```

```csharp
// Bildirilecek olan nesnelere paremetre olarak giden mesaj.
// UML diyagramı ile ilgisi yoktur.
class ProductUpdateMessage
{
    public string productName;
    public string message;

    public override string ToString()
    {
        return $"{productName} updated. Message: {message}";
    }
}
```

```csharp

// Takip edilecek olan yapımızdır.
// İçerisinde Observer (değişimden etkilenecek) nesneleri tutar.
// UML diyagramındaki Observable yapısına denk gelmektedir.
abstract class ObservableProduct
{
    private List<IObserverUser> _users;
    protected ProductUpdateMessage message;

    public ObservableProduct()
    {
        _users = new List<IObserverUser>();
        message = new ProductUpdateMessage();
    }

    public void AddObserver(IObserverUser observerUser)
    {
        _users.Add(observerUser);
    }

    public void RemoveObserver(IObserverUser observerUser)
    {
        _users.Remove(observerUser);
    }

    public void NotifyObserver()
    {
        foreach (IObserverUser user in _users)
        {
            user.SendNotification(message);
        }
    }
}
```

```csharp
// Observer sınıfından türer.
// UML diyagramındaki ConcreteObservable yapısına denk gelmektedir.
class Samsung : ObservableProduct
{
    // Ürün fiyatı değiştikten sonra Observer örneklerine bildirim gönderilir.
    public void ChangePrice()
    {
        // Ürün fiyatlarının güncellenmesi vs.

        this.message.productName = "Samsung";
        this.message.message = "Samsung's price updated.";
        this.NotifyObserver();
    }
}
```

```csharp
// Güncellemeden etkilenecek olan sınıf örnekleri.
IObserverUser mehmet = new ObserverUser();
IObserverUser derya = new ObserverUser();
IObserverUser sema = new ObserverUser();
IObserverUser aleyna = new ObserverUser();


// İzlenecek olan sınıf örneği.
Samsung samsung = new Samsung();

// İzlenecek olan sınıfa etkilenecek olan nesnelerin atanması.
samsung.AddObserver(mehmet);
samsung.AddObserver(derya);
samsung.AddObserver(sema);
samsung.AddObserver(aleyna);

samsung.ChangePrice();

// output:
//  Samsung updated. Message: Samsung's price updated.
//  Samsung updated. Message: Samsung's price updated.
//  Samsung updated. Message: Samsung's price updated.
//  Samsung updated. Message: Samsung's price updated.
```

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını [bu tasarım deseni için oluşturulmuş klasörde](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/tree/master/observer) bulabilirsiniz.*