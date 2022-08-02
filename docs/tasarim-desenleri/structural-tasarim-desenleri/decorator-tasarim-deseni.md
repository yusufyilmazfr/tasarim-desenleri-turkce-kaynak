> Decorator tasarım deseni, nesnelere dinamik olarak yeni sorumluluklar atamamızı sağlayan tasarım desenidir.

Bir sınıfın davranışını değiştirmemiz gerektiğinde akla gelen ilk şeylerden birisi temel operasyonların tanımlandığı bir sınıf tanımlamak ve daha sonra o sınıfı genişletmek bu sayede aynı davranışı farklı şekillerde sergileyen birçok sınıf olacaktır.

Örnek vermek gerekirse bir dosyanın okunması ve dosyaya yazılma işlemi. (UML diyagramı aşağıdaki gibi olacaktır.)

![decorator-1](../../../images/decorator-1.png)

İlerleyen süreçte dosya işlemlerinde; yazılan dosyanın sıkıştırılması ya da bir çeşit imzalama işlemlerine tabi tutulması, okunan dosyaların değiştirilmiş olup olmadığı kontrol gibi senaryolar da gelebilir. Bu tür senaryolar karşısında mevcut sınıftan yeni sınıflar türetme yolunda ilerleriz.

![decorator-2](../../../images/decorator-2.png)

Gittikçe hiyerarşi artmaktadır. Bunun yanı sıra;

- Üst sınıflarda yapılacak herhangi bir değişiklik hiyerarşinin alt kısımlarını da etkilemektedir. 

- Sıkıştırma işlemlerini yaparken imzalama işleminin de yapılması istendiğinde ortaya bu farklı durumların kombinasyonu kadar sonuç çıkmaktadır.

- Çoğu programlama dilinde bir sınıfın sadece bir adet üst sınıfı olmaktadır, yani bir sınıftan türeyebiliyor. Bu da hiyerarşi için oldukça zor duruma sokacaktır bizleri.

- Kalıtım statik bir yapıdadır bu yüzden run-time sırasında nesnenin davranışı değiştirilemeyecektir. (Alt sınıf davranışları hariç)

gibi bir çok dezavantaj ortaya çıkmaktadır bu tür olaylarda. Bu tür durumlarda Composite tasarım deseni kullanılmaktadır. Kalıtımdan ziyade composition (bileşim) işlemi yapılmalıdır. Aşağıda bu desene ait UML diyagramı bulunmaktadır.

![decorator-uml](../../../images/decorator-uml.png)

- **Component:** Üst sınıfların uygulaması için ortak bir arayüz. Bu arayüzde tanımlanan işlemler daha sonra `ConcreteDecorator` sınıfları tarafından değiştirilen tanımlamalardır.

- **ConcreteComponent:** Temel davranışın uygulandığı sınıftır. `ConcreteDecorator` sayesinde değiştirilecektir.

- **BaseDecorator:** `Component` arayüzünü uygular ve bu arayüzü uygulayan yapının referansını da barındırır.

- **ConcreteDecorator:** Yeni davranışların tanımlandığı sınıftır, `BaseDecorator` sınıfından türer.

C# Kod Örneği:

```csharp
// Üst sınıfların uygulayacağı arayüzdür.
// Yapılacak temel işlemler tanımlanmıştır.
// UML diyagramındaki Component arayüzüne denk gelmektedir.
interface IDataSource
{
    string GetFileName();
    void WriteData(object data);
    void ReadData();
}
```

```csharp
// Temel işlemlerin tanımlandığı IDataSource arayüzünü uygulayan sınıftır.
// UML diyagramındaki ConcreteComponent sınıfına denk gelmektedir.
class FileDataSource : IDataSource
{
    private string _fileName;

    public FileDataSource(string fileName)
    {
        _fileName = fileName;
    }

    public string GetFileName()
    {
        return _fileName;
    }

    public void ReadData()
    {
        Console.WriteLine($"{_fileName} readed.");
    }

    public void WriteData(object data)
    {
        Console.WriteLine($"data was written to {_fileName}.");
    }
}
```

```csharp
// UML diyagramındaki Component (IDataSource) arayüzünü uygular.
// Constructor sayesinde özellikleri değiştirilmesi istenen nesnenin referansı tutulur.
// Değiştirilmesini istediğimiz metotları abstract anahtar kelimesi ile işaretledik.
// UML diyagramındaki BaseDecorator yapısına denk gelmektedir.
abstract class BaseDataSourceDecorator : IDataSource
{
    protected IDataSource dataSource;

    public BaseDataSourceDecorator(IDataSource dataSource)
    {
        this.dataSource = dataSource;
    }

    public abstract string GetFileName();

    public abstract void ReadData();

    public abstract void WriteData(object data);
}
```

```csharp
// Yeni davranışların tanımlandığı sınıftır.
// UML diyagramındaki BaseDecorator (BaseDataSourceDecorator) sınıfından türer.
// UML diyagramındaki ConcreteDecorator sınıfına denk gelmektedir.
class ComporessionDecorator : BaseDataSourceDecorator
{
    public ComporessionDecorator(IDataSource dataSource) : base(dataSource)
    {
    }

    public override string GetFileName()
    {
        return base.dataSource.GetFileName();
    }

    public override void ReadData()
    {
        // Veriyi okurken referansını tuttuğumuz sınıfın kendi davranışını sergilemesini istiyoruz.
        base.dataSource.ReadData();
    }

    public override void WriteData(object data)
    {
        // Burada gelen veriye ait sıkıştırma işlemleri yapılacaktır.
        Console.WriteLine("Data compressed.");

        // Sıkıştırma işlemleri yapıldıktan sonra yazma işlemleri gerçekleştirilecektir.
        Console.WriteLine($"Compressed data was written to {base.dataSource.GetFileName()}.");
    }
}
```

```csharp
IDataSource dataSource = new FileDataSource("data.sql");

IDataSource compressedDataSource = new ComporessionDecorator(dataSource);

compressedDataSource.ReadData();
compressedDataSource.WriteData(new object());

// output:
//      data.sql readed.
//      Data compressed.
//      Compressed data was written to data.sql.
```

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını [bu tasarım deseni için oluşturulmuş klasörde](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/tree/master/decorator) bulabilirsiniz.*