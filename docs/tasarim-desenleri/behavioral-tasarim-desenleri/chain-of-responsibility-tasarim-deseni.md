> Chain of Responsibility tasarım deseni, bir amaca yönelik bir dizi işlemi gerçekleştiren nesnelerin birbirinden bağımsız bir şekilde çalışmasını ve herbir nesnenin sadece kendisiyle tanımlı işleri yapmasını sağlayan bir tasarım desenidir.

Geliştirdiğimiz uygulamada gelen görselleri PNG formatına çevirdiğimiz var sayılsın.

C# Kod Örneği:

```csharp
// Uygulama süresince resimlerimizi temsil edecek sınıf.
class Image
{
    public string name;
    public string extension;

    public Image(string name, string extension)
    {
        this.name = name;
        this.extension = extension;
    }
}
```

```csharp
Image image = new Image("tatil-fotografim", "JPEG");

if (image.extension == "JPG")
{
    // JPG işlemine ait dönüştürme kodları işlemleri.
}
else if (image.extension == "JPEG")
{
    // JPEG işlemine ait dönüştürme kodları işlemleri.
}
else
{
    // Diğer türlere ait dönüştürme işlemleri.
}
```

Yukarıdaki koda bakıldığı zaman if-else içerisinde bir yığın görünmektedir. Herbir if bloğu kendi başına bir işlem. Yeni bir uzantı geldiğinde tekrardan bir blok açmamız gerekecektir, bunların yanı sıra bu kodu başka bir yerde de kullanılmak istendiğinde iyice kod kalabalığına da sebep olacaktır. Bu tasarım deseni, bizlere sorumlulukları ayrı bir sınıfa ayırmamızı ve birbirlerine gevşek bağlı olacak şekilde bağlamamızı söylüyor. Aşağıda bu desene ait UML diyagramı mevcuttur. Kodu UML diyagramına bakarak aşağıdaki gibi düzenleyebiliriz.

![chain-of-responsibility](../../../images/chain-of-responsibility.png)

C# Kod Örneği:

```csharp
// Uygulama süresince resimlerimizi temsil edecek sınıf.
class Image
{
    public string name;
    public string extension;

    public Image(string name, string extension)
    {
        this.name = name;
        this.extension = extension;
    }
}
```

```csharp
// Zincirin bir sonraki halkasının referansının tutulduğu sınıftır.
// İşlemi gerçekleştirecek olan metot tanımı bulunur.
// UML diyagramındaki BaseHandler sınıfına denk gelmektedir.
abstract class BaseHandler
{
    protected BaseHandler _nextHandler;
    public void SetNextHandler(BaseHandler nextHandler)
    {
        _nextHandler = nextHandler;
    }

    public abstract void HandleRequest(Image image);
}
```

```csharp
// JPEG dosyalarını dönüştüren sınıf.
// UML diyagramındaki ConcreteHandler sınıfına denk gelmektedir.
class JPEGHandler : BaseHandler
{
    public override void HandleRequest(Image image)
    {
        if (image.extension == "JPEG")
        {
            Console.WriteLine("JPEG to PNG");
            // JPEG işlemine ait dönüştürme kodları işlemleri.
        }
        else
        {
            // Bu sınıfa ait bir işlem değilse zincirin bir sonraki halkasına aktarılır.
            _nextHandler.HandleRequest(image);
        }
    }
}
```

```csharp
// JPG dosyalarını dönüştüren sınıf.
// UML diyagramındaki ConcreteHandler sınıfına denk gelmektedir.
class JPGHandler : BaseHandler
{
    public override void HandleRequest(Image image)
    {
        if (image.extension == "JPG")
        {
            Console.WriteLine("JPG to PNG");
            // JPG işlemine ait dönüştürme kodları işlemleri.
        }
        else
        {
            // Bu sınıfa ait bir işlem değilse zincirin bir sonraki halkasına aktarılır.
            _nextHandler.HandleRequest(image);
        }
    }
}
```

```csharp
// Herhangi bir tipteki dosyayı dönüştüren sınıf.
// UML diyagramındaki ConcreteHandler sınıfına denk gelmektedir.
class CustomHandler : BaseHandler
{
    public override void HandleRequest(Image image)
    {
        if (image.extension == "OtherExtension")
        {
            Console.WriteLine("OtherExtension to PNG");
            // Herhangi bir tipteki dosyanın işlemine ait dönüştürme kodları işlemleri.
        }
        // Burada else ifadesi bulunmamaktadır bu da zincirin son halkası olduğu anlamına gelir.
    }
}
```

```csharp
Image image = new Image("tatil-fotografim", "JPG");

JPEGHandler jpegHandler = new JPEGHandler();
JPGHandler jpgHandler = new JPGHandler();
CustomHandler customHandler = new CustomHandler();

// Zincirlerin birbirleri ile bağlantısının yapıldığı yerdir.
// JPEG bu işlemi gerçekleştiremezse JPG'e aktarır o da Custom'a aktarır.
jpegHandler.SetNextHandler(jpgHandler);
jpgHandler.SetNextHandler(customHandler);

jpegHandler.HandleRequest(image); // output: JPG to PNG
```

Bu tasarım desenini bu probleme uyarlayarak;

- Tekrar kullanılabilir kod elde ettik.
- Bağımlılıkları gevşek hale getirdik.
- Zincirin halkası istemci tarafından değiştirilebilir bu sayede de genişletilebilir bir yapı elde edildi.

gibi faydaları görebilmekteyiz.

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını [bu tasarım deseni için oluşturulmuş klasörde](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/tree/master/chain-of-responsibility) bulabilirsiniz.*