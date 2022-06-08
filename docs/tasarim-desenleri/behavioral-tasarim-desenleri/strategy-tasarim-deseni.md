> Strategy tasarım deseni, bir algoritma ailesi tanımlamamızı, her birini ayrı bir sınıfa koymamızı ve nesnelerinin birbiriyle değiştirilebilir hale getirmenizi sağlayan davranışsal bir tasarım modelidir.

Bir işlemin birden fazla yapılması, çalışma zamanında algoritma değişikliği gibi durumlarda kullanılır, karışık if-else durumundan da kurtarır. Soyutlamadan dolayı da `Loosely Coupled` bir uygulama halini alır.

![stragety-uml](../../../images/stragety-uml.png)

Senaryo olarak e-ticaret projesinin ödeme kısmını düşünelim. Ödeme metotları arasında; kredi kartı, Paypal gibi seçenekler mevcuttur. 

C# Kod Örneği:

```csharp
// UML diyagramındaki Strategy arayüzüne denk gelmektedir.
// Benzer işlemleri yapan sınıflar bu arayüzden türeyecektir.
interface IPayment
{
    void Pay(int amount);
}
```

```csharp
// UML diyagramındaki ConcreteStrategy sınıfına denk gelmektedir.
// UML diyagramındaki Strategy arayüzüne denk gelen arayüzü uyguluyor.
class PaypalPayment : IPayment
{
    private string _email;
    private string _password;

    public PaypalPayment(string email, string password)
    {
        _email = email;
        _password = password;
    }

    public void Pay(int amount)
    {
        // Kredi kartı ödeme işlemlerinin gerçekleştiği yer.
        Console.WriteLine("Paid by Paypal.");
    }
}
```

```csharp
// UML diyagramındaki ConcreteStrategy sınıfına denk gelmektedir.
// UML diyagramındaki Strategy arayüzüne denk gelen arayüzü uyguluyor.
class CreditCartPayment : IPayment
{
    private string _name;
    private string _cardNumber;
    private string _cvv;
    private string _dateOfExpiry;

    public CreditCartPayment(string name, string ccNum, string cvv, string expiryDate)

    {
        _name = name;
        _cardNumber = ccNum;
        _cvv = cvv;
        _dateOfExpiry = expiryDate;
    }

    public void Pay(int amount)
    {
        // Kredi kartı ödeme işlemlerinin gerçekleştiği yer.
        Console.WriteLine("Paid by credit cart.");
    }
}
```

```csharp
// Sepette bulunan ürünleri temsil eden sınıf.
// Ürün kodu ve fiyat bilgisi temel olarak yeterlidir.
class Item
{
    private string _upcCode;
    private int _price;

    public Item(string upcCode, int price)
    {
        _upcCode = upcCode;
        _price = price;
    }

    public int GetPrice()
    {
        return _price;
    }
}
```

```csharp
// UML diyagramındaki Context sınıfına denk gelmektedir.
// UML diyagramındaki Strategy(IPayment) arayüzüne ait referansı tutmaktadır.
class ShoppingCart
{
    private List<Item> _items;
    private IPayment _payment;

    public ShoppingCart()
    {
        _items = new List<Item>();
    }

    public void SetPaymentMethod(IPayment payment)
    {
        _payment = payment;
    }

    public void AddItem(Item item)
    {
        _items.Add(item);
    }

    public int CalculateTotal()
    {
        int sum = 0;
        foreach (Item item in _items)
        {
            sum += item.GetPrice();
        }
        return sum;
    }

    public void Pay()
    {
        int amount = CalculateTotal();
        _payment.Pay(amount);
    }
}
```

```csharp
ShoppingCart shoppingCart = new ShoppingCart();
shoppingCart.AddItem(new Item("894651364", 80));
shoppingCart.AddItem(new Item("654798243", 20));

shoppingCart.SetPaymentMethod(new PaypalPayment("yusufyilmazfr@gmail.com", "examplepassword"));
shoppingCart.Pay(); // output: Paid by Paypal.


shoppingCart.SetPaymentMethod(new CreditCartPayment("Julia Rodriguez", "4373093149845972", "199", "12/2024"));
shoppingCart.Pay(); // output: Paid by credit cart.
```

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını [bu tasarım deseni için oluşturulmuş klasörde](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/tree/master/strategy) bulabilirsiniz.*