> Memento tasarım deseni, bir nesnenin önceki durumunu kaydetmemizi ve istenildiği takdirde eski haline dönmemizi sağlayan tasarım desenidir.

Bu desene ait UML diyagramı aşağıdaki gibidir.

![memento-uml](../../../images/memento-uml.png)

- **Memento:** Saklamak istediğimiz nesnemizin tamamını ya da bir kısmını tutan sınıftır.

- **CareTaker:** Memento'ların (saklanan nesnelerin) referansının tutulduğu sınıftır.

- **Originator:** Değerleri tutulacak olan ve önceki değerlerine geri dönebilen sınıftır.

Senaryo olarak bir metin editörü geliştirdiğimizi ve bu metin editöründe önceki yazdıklarımıza ve o anki cursor pozisyonuna geri dönebildiğimizi düşünelim.

C# Kod Örneği:

```csharp
// Saklamak istediğimiz değerlerin tanımlandığı yerdir.
// UML diyagramındaki Memento yapısına denk gelir.
class TextMemento
{
    public string Text { get; set; }
    public int CursorPosition { get; set; }
}
```

```csharp
// Memento'ların referansının tutulduğu yerdir.
// UML diyagramındaki CareTaker yapısına denk gelmektedir.
class TextUndoCareTaker
{
    private Stack<TextMemento> _mementos;

    public TextUndoCareTaker()
    {
        _mementos = new Stack<TextMemento>();
    }

    // Çağrılma işlemi yapıldığında yığının en üstündeki Memento örneği silinir ve geriye döndürülür.

    // Ekleme işlemi yapıldığında yığının en üstüne Memento örneği eklenir.
    // Klasik Stack.
    public TextMemento TextMemento
    {
        get
        {
            return _mementos.Pop();
        }
        set
        {
            _mementos.Push(value);
        }
    }
}
```

```csharp
// Değerleri tutulacak olan ve önceki değerlerine geri dönebilen sınıftır.
// UML diyagramındaki Originator yapısına denk gelmektedir.
// Geriye dönebilme özelliği olduğundan önceki durumları tutan CareTaker referansını tutmaktadır.
class TextOriginator
{
    public string Text { get; set; }
    public int CursorPosition { get; set; }

    private TextUndoCareTaker _textCareTaker;

    public TextOriginator()
    {
        _textCareTaker = new TextUndoCareTaker();
    }

    // Anlık kayıt değerlerini UML diyagramındaki CareTaker üzerinden yığına eklemektedir.
    public void Save()
    {
        _textCareTaker.TextMemento = new TextMemento
        {
            CursorPosition = this.CursorPosition,
            Text = this.Text
        };
    }

    // Geri alma işleminde yığının en üstündeki değeri alır.
    // Değer alma işleminden sonra sınıfın mevcut değerlerine atanır.
    public void Undo()
    {
        TextMemento previousTextMemento = _textCareTaker.TextMemento;

        CursorPosition = previousTextMemento.CursorPosition;
        Text = previousTextMemento.Text;
    }

    public override string ToString()
    {
        return $"text: {Text}, cursor position: {CursorPosition}";
    }
}
```

```csharp
TextOriginator textOriginator = new TextOriginator();

textOriginator.Text = "asm";
textOriginator.CursorPosition = 3;

// Anlık durum yığına ekleniyor.

textOriginator.Save();


textOriginator.Text = "asmi";
textOriginator.CursorPosition = 4;

// Anlık durum yığına ekleniyor.
textOriginator.Save();

textOriginator.Text = "asmin";
textOriginator.CursorPosition = 5;

// Anlık durum yığına ekleniyor.
textOriginator.Save();

// Yığındaki bir önceki duruma geçiyor.
textOriginator.Undo();
Console.WriteLine(textOriginator.ToString());

// Yığındaki bir önceki duruma geçiyor.
textOriginator.Undo();
Console.WriteLine(textOriginator.ToString());

// Yığındaki bir önceki duruma geçiyor.
textOriginator.Undo();
Console.WriteLine(textOriginator.ToString());

//output:
//  text: asmin, cursor position: 5
//  text: asmi, cursor position: 4
//  text: asm, cursor position: 3
```

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını [bu tasarım deseni için oluşturulmuş klasörde](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/tree/master/memento) bulabilirsiniz.*