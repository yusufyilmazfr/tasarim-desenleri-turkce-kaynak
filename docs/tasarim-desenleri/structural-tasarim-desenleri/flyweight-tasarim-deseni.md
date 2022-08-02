> Flyweight tasarım deseni, sık kullanılan nesnelerin bellek yönetimini kontrol etmek için kullanılan bir tasarım desenidir.

Bu kalıbın amacı aynı nesneleri bellekte çokça oluşturmak yerine her bir nesnenin bir kopyasını oluşturmak ve oluşturulan nesneleri ortak bir havuzda tutup istenildiği taktirde havuzdan nesnenin seçilip verilmesine dayanır.

Bu tasarım desenine ait UML diyagramı aşağıdaki gibidir.

![ ](../../../images/flyweight-uml.png)

- **Flyweight:** Nesnenin ortak özelliklerini tutan yapıdır. Interface de olabilir abstract class da. 

- **ConcreteFlyweight:** Flyweight şablonunu uygulayan farklı nesneleri içeren sınıflardır.

- **FlyweightFactory:** `Flyweight` havuzunu tutacak sınıftır, eğer daha önceden nesne oluşturulmamışsa havuza atılacak oluşturulmuş ise de havuzdan seçilip verilecektir.

Yukarıdaki UML diyagramına bakıldığı zaman **intrinsic** gibi kavramlar göze çarpacaktır. Herbir Flyweight nesnesi temel olarak iki veri kümesinden oluşur. **Dahili (intrinsic)** olarak geçen **durum-bağımsız (state-independent)** kısım parçalardan birisir. Bu kısımda, çalışma zamanındaki tüm Flyweight nesneleri tarafından saklanan paylaşılmış alanlar yer almaktadır. Diğer parça ise **durum-bağımlı (state-dependent)** olarak bilinen ve **dışsal**  **(extrinsic)** olarak belirtilen kısımdır. Bu kümedeki veriler ise istemci tarafından saklanır, hesap edilir ve Flyweight nesne örneğine, yine Flyweight'in bir operasyonu yardımıyla aktarılırlar.

Senaryo olarak oyunda bir sahne tasarlandığını ve sahne arka planında bulunan kutuların rastgele yerleştirdiğini varsayalım. Burada kutuların değişen tek şeyi renk ve konumları olacaktır.

C# Kod Örneği:

```csharp
// Kutuların rengini tutmaktadır.
enum BoxColor
{
    Black,
    Blue
}
```

```csharp
// Nesnenin ortak özelliklerini tutan sınıftır.
// UML diyagramındaki Flyweight yapısına denk gelmektedir.
abstract class Box
{
    // Intrinsic değerler.
    public int width;
    public int height;
    public BoxColor boxColor;

    public abstract void Draw(int locationX, int locationY);
}
```

```csharp
// Flyweight (Box) şablonunu uygulayan sınıftır.
// UML diyagramındaki ConcreteFlyweight sınıfına denk gelmektedir.
class BlueBox : Box
{
    public BlueBox(int width, int height)
    {
        this.width = width;
        this.height = height;
        this.boxColor = BoxColor.Blue;
    }

    public override void Draw(int locationX, int locationY)
    {
        Console.WriteLine($"{boxColor} box drawn. {locationX},{locationY}");
    }
}
```

```csharp
// Flyweight (Box) şablonunu uygulayan sınıftır.
// UML diyagramındaki ConcreteFlyweight sınıfına denk gelmektedir.
class BlackBox : Box
{
    public BlackBox(int width, int height)
    {
        this.width = width;
        this.height = height;
        this.boxColor = BoxColor.Black;
    }

    public override void Draw(int locationX, int locationY)
    {
        Console.WriteLine($"{boxColor} box drawn. {locationX},{locationY}");
    }
}
```

```csharp
// Flyweight (Box) havuzunu tutacak sınıftır.
// Eğer daha önceden nesne oluşturulmamışsa havuza atılacak.
// Oluşturulmuş ise de havuzdan seçilip verilecektir.
// UML diyagramındaki FlyweightFactory sınıfına denk gelmektedir. 
class BoxFactory
{
    private Dictionary<BoxColor, Box> _boxes;

    public BoxFactory()
    {
        _boxes = new Dictionary<BoxColor, Box>();
    }


    public Box Get(BoxColor boxColor)
    {
        if (_boxes.ContainsKey(boxColor))
        {
            return _boxes[boxColor];
        }

        Box box = null;

        if (boxColor == BoxColor.Black)
        {
            box = new BlackBox(20, 20);
        }
        else if (boxColor == BoxColor.Blue)
        {
            box = new BlueBox(20, 20);
        }

        _boxes.Add(boxColor, box);
        return box;
    }
}
```

```csharp
BoxFactory boxFactory = new BoxFactory();

Box blackBox1 = boxFactory.Get(BoxColor.Black);
Box blackBox2 = boxFactory.Get(BoxColor.Black);
Box blackBox3 = boxFactory.Get(BoxColor.Black);
Box blueBox1 = boxFactory.Get(BoxColor.Blue);

blackBox1.Draw(97, 37);
blackBox2.Draw(34, 78);
blackBox3.Draw(74, 193);
blueBox1.Draw(1, 4);
// output:
//  Black box drawn. 97,37
//  Black box drawn. 34,78
//  Black box drawn. 74,193
//  Blue box drawn. 1,4
```

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını [bu tasarım deseni için oluşturulmuş klasörde](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/tree/master/flyweight) bulabilirsiniz.*