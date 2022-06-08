> Command tasarım deseni, kullanıcı isteklerini gerçekleştiren kod yapısını sarmallayarak nesneler halinde saklanmasını daha sonra da bu isteklerin gerçekleştirilmesini veya geri alınmasını sağlayan tasarım desenidir.

Nesne üzerinde bir işleminin nasıl yapıldığını bilmediğimiz ya da kullanılmak istenen nesneyi tanımadığımız durumlarda kullanılır.

Bu tasarım desenine ait UML diyagramı aşağıdaki gibidir.

![ ](../../../images/command-uml.png)

- **Command:** Temel arayüzdür, komutların çalıştırılması için temel metotu içermektedir.

- **ConcreteCommand:** Nesnelere dönüştürdüğümüz her bir isteğe denk gelmektedir, `Command` arayüzünü uygular.

- **Invoker:**  `Command` referansını tutan, metotun ne zaman çağrılacağını belirtir.

- **Receiver:** `Client` tarafının asıl iletişime geçeceği sınıftır.

Senaryo olarak bir ürüne ait stok takibi verilen basit bir sistem olduğunu var sayalım. Burada stok ile ilgili işlemler bu tasarım desenine göre yapılsın. 

C# Kod Örneği:

```csharp
// Komutları nesneler haline getirelecek olan sınıf.
// UML diyagramındaki Receiver sınıfına denk gelmektedir.
class StockManager
{
    private string _name;
    private int _quantity;

    public StockManager(string name, int quantity)
    {
        _name = name;
        _quantity = quantity;
    }

    public void Buy()
    {
        Console.WriteLine($"Stock: {_name}, {_quantity} bought!");
    }

    public void Sell()
    {
        Console.WriteLine($"Stock: {_name}, {_quantity} sold!");
    }
}
```

```csharp
// Temel arayüzdür.
// Komutların çalıştırılması için temel metotu içermektedir.
// UML diyagramındaki Command arayüzüne denk gelmektedir.
interface IOrderCommand
{
    void Execute();
}
```

```csharp
// Nesnelere dönüştürdüğümüz her bir isteğe denk gelmektedir.
// Command (IOrderCommand) arayüzünü uygular.
// UML diyagramındaki ConcreteCommand sınıfına denk gelmektedir.
class BuyStock : IOrderCommand
{
    private StockManager _stockManager;

    public BuyStock(StockManager stockManager)
    {
        _stockManager = stockManager;
    }

    public void Execute()
    {
        _stockManager.Buy();
    }
}
```

```csharp
// Nesnelere dönüştürdüğümüz her bir isteğe denk gelmektedir.
// Command (IOrderCommand) arayüzünü uygular.
// UML diyagramındaki ConcreteCommand sınıfına denk gelmektedir.
class SellStock : IOrderCommand
{
    private StockManager _stockManager;

    public SellStock(StockManager stockManager)
    {
        _stockManager = stockManager;
    }

    public void Execute()
    {
        _stockManager.Sell();
    }
}
```

```csharp
// Command (IOrderCommand) arayüzünü uygulayan sınıf referansını tutar.
// Metotun ne zaman çağrılacağını belirtir.
// UML diyagramındaki Invoker sınıfına denk gelmektedir.
class StockController
{
    private List<IOrderCommand> _orderCommands;

    public StockController()
    {
        _orderCommands = new List<IOrderCommand>();
    }

    public void TakeOrder(IOrderCommand command)
    {
        _orderCommands.Add(command);
    }

    public void PlaceOrders()
    {
        foreach (IOrderCommand command in _orderCommands)
        {
            command.Execute();
        }

        _orderCommands.Clear();
    }
}
```

```csharp
StockManager stockManager = new StockManager("iPhone", 200);

BuyStock buyStock = new BuyStock(stockManager);
SellStock sellStock = new SellStock(stockManager);

StockController stockController = new StockController();

stockController.TakeOrder(buyStock);
stockController.TakeOrder(sellStock);
stockController.TakeOrder(sellStock);


stockController.PlaceOrders();
// output:
//  Stock: iPhone, 200 bought!
//  Stock: iPhone, 200 sold!
//  Stock: iPhone, 200 sold!
```

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını [bu tasarım deseni için oluşturulmuş klasörde](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/tree/master/command) bulabilirsiniz.*