> State tasarım deseni, bir nesnenin iç durumu değiştiğinde meydana gelecek değişimler sonrası çalışma zamanında dinamik olarak farklı davranışları sergileyebilmesini sağlayan bir tasarım desenidir.

State tasarım desenini **biçimsel diller ve otomatalar, durum makinaları** ile de ifade edilebilmektedir. Otomatalarda da olduğu gibi kodlarımızda da durumlar söz konusudur. Bir durumunda başka bir duruma gitmek, orada tekrar etmek ya da geriye dönmek gibi durumlarımız ve bu durumları gerçekleştirirken ki davranışlarımız mevcuttur.

Yazılım tarafından olaya baktığımızda aslında state diagramları ile ifade edilebilen her nesne için state deseninin uygulanabileceğini düşünebiliriz. Örneğin uygulamanın çalıştığı makinenin bellek durumları state kalıbına uygun olarak tasarlanabilir. Makinenin normal seviyede olması, sistem kaynaklarının çok tüketilmesi sonucu alarm haline geçmesi veya alarm verilmeden önce uyarı moduna geçmesi söz konusu olabilir. Bu durumlar arasındaki geçişler aslında bilgisayarın bazı iç değerlerine göre gerçeklenir. Memory, CPU, Running Process ölçümleri birer kriter olabilir ve örneğin Computer isimli bir nesnenin iç durumunu ifade edebilir.

Bu aşamada, bundan sonra **internal state'** i taşıyan yani davranışı değişecek olan nesneye **Context** dediğimizi düşünelim. Birden fazla davranış ve doğal olarak durum olabileceğinden, **Context'** in farklı durumlara erişebilip aralardaki **geçişleri(Transitions)** sağlayabilmesi gerekir. Bu durumda, **Context** tipinin tüm durumlar için ortak bir arayüz sunan başka bir tip ile *(buna State diyebiliriz)*  **Aggregation** ilişkisini sağlaması uygundur.

**State** tipinin kendisi aslında, **Context** tipinin belli bir durumu ile ilişkilendirilmiş davranışların kapsüllenmesi için bir arayüz sunmaktadır. Bu arayüz sunumu **aslı durum tipleri(Concrete State)** tarafından değerlendirilebilir. Bu tanımlar doğrultusunda bu tasarım desenine ait UML diyagramı aşağıdaki gibi olacaktır.

![state-uml](../../../images/state-uml.png)

- **State:** Davranışın/olayın tanımlandığı arayüzdür, soyut sınıf da olabilmektedir. 

- **ConcreteState:**  `State` arayüzünü uygular, bu sayede farklı durumlar meydana gelir.

- **Context:** Durumu izlenecek olan nesnedir.

Senaryol olarak yiyecek otomatları düşünülebilir. Bu otomatlar için sıralı durumlar mevcuttur. Bunlar; 

1. Ön hazırlıkların yapılması durumu => **InitializeState**

2. Bekleme durumu => **WaitingState**

3. Ürünün hazırlanması durumu => **PreparingState**

4. Ürünün teslim edilmesi durumu => **DeliveryState**

C# Kod Örneği:

```csharp
// Davranışların tanımlandığı soyut sınıftır.
// UML diyagramındaki State yapısına denk gelmektedir.
public abstract class VendingMachineState
{
    public abstract void HandleState(VendingMachine context);
}
```

```csharp
// Farklı durumların meydana geldiği sınıf.
// UML diyagramındaki State (VendingMachineState) yapısından türer.
// UML diyagramındaki ConcreteState yapısına denk gelmektedir.
class InitializeState : VendingMachineState
{
    // Başlangıç durumu ayarları yapıldıktan sonra WaitingState (hazır) durumuna geçer.
    public override void HandleState(VendingMachine context)
    {
        Console.WriteLine("InitializeState: Ön hazırlıklar yapılıyor.");

        context.SetState(new WaitingState());
    }
}
```

```csharp
// Farklı durumların meydana geldiği sınıf.
// UML diyagramındaki State (VendingMachineState) yapısından türer.
// UML diyagramındaki ConcreteState yapısına denk gelmektedir.
class WaitingState : VendingMachineState
{
    // WaitingState durumunda herhangi bir yeni duruma geçmeye gerek yok.
    // Buradan sonraki durum gelen istek ile aksiyon alacaktır.
    public override void HandleState(VendingMachine context)
    {
        Console.WriteLine("WaitingState: Otomata herhangi bir aksiyon bekliyor.");
    }
}
```

```csharp
// Farklı durumların meydana geldiği sınıf.
// UML diyagramındaki State (VendingMachineState) yapısından türer.
// UML diyagramındaki ConcreteState yapısına denk gelmektedir.
class PreparingState : VendingMachineState
{
    // PreparingState durumunda ürün hazırlanması gibi işlemler yapılmaktadır.
    // Buradan sonraki durum ise ürünün verilmesi durumudur. (DeliveryState) 
    public override void HandleState(VendingMachine context)
    {
        Console.WriteLine("PreparingState: İstenilen ürün hazırlanıyor. Lütfen bekleyiniz");

        context.SetState(new DeliveryState());
    }
}
```

```csharp
// Farklı durumların meydana geldiği sınıf.
// UML diyagramındaki State (VendingMachineState) yapısından türer.
// UML diyagramındaki ConcreteState yapısına denk gelmektedir.
class DeliveryState : VendingMachineState
{
    // DeliveryState durumunda otomatadan ürünün teslim işlemleri yapılmaktadır.
    // Ürün verildikten sonra başlangıç, bekleme durumuna geçmektedir. (WaitingState)
    public override void HandleState(VendingMachine context)
    {
        Console.WriteLine("DeliveryState: Ürün teslim ediliyor.");

        context.SetState(new WaitingState());
    }
}
```

```csharp
// Durumu izlenecek olan sınıftır.
// UML diyagramındaki Context yapısına denk gelmektedir.
public class VendingMachine
{
    private VendingMachineState _state;

    // Otomata örneği oluştuğu zaman başlangıç durumuna geçiyor.
    public VendingMachine()
    {
        SetState(new InitializeState());
    }

    public void SetState(VendingMachineState state)
    {
        _state = state;
        _state.HandleState(this);
    }

    public void RequestProduct(string productName, double price)
    {
        // Burada ürünlere ait iş kodları olacaktır.
        // Ürün kontrolü, fiyatlandırma gibi kontroller.
        // Ürün ve fiyat olarak bir problemin olmadığı var sayılsın.

        SetState(new PreparingState());
    }
}
```

```csharp
VendingMachine vendingMachine = new VendingMachine();
vendingMachine.RequestProduct("COVID-19 MASKE", 2);

// output:
//  InitializeState: Ön hazırlıklar yapılıyor.
//  WaitingState: Otomata herhangi bir aksiyon bekliyor.
//  PreparingState: İstenilen ürün hazırlanıyor.Lütfen bekleyiniz
//  DeliveryState: Ürün teslim ediliyor.
//  WaitingState: Otomata herhangi bir aksiyon bekliyor.
```

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını [bu tasarım deseni için oluşturulmuş klasörde](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/tree/master/state) bulabilirsiniz.*