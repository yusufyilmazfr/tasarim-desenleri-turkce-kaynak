> Template Method tasarım deseni, üst sınıflarda bir algoritma iskeleti tanımlamamızı ve alt sınıfların algoritma iskeleti yapısını bozmadan belirli adımları yeniden tanımlamasını (override) sağlayan tasarım desenidir.

Yazdığımız metotun (ki buradaki metot uml diyagramındaki `TemplateMetot` oluyor) davranışı, içerisindeki adımları  bazı durumlara göre farklılık gösterebilmektedir. Bu farklılıkları sağlayan adımları, metotları soyutlarayak bir alt sınıfın kendince uyarlamasını sağlamaya yarar bu tasarım deseni. 

Aşağıda bu tasarım desenine ait UML diyagramı bulunmaktadır.

![template-method-uml](../../../images/template-method-uml.png)

- **AbstractClass:** Alt sınıfların uygulaması için oluşturulmuştur, metot iskeletimizi ve soyutlanmış diğer metotları içerir. Soyut sınıfımızdır, arayüz de olabilir. 

- **ConcreteClasss:** `AbstractClass` sınıfından türer. Soyutlanmış metotları kendince tanımlanmasını sağlar.

Senaryo olarak geçen haftanın verilerinin analizinin yapılıp en sonda da bizlere bir çıktı, rapor verilğini düşünelim. Burada rapor verme süreçleri farklılık gösterebilir. Örneğin; XML formatında da bir rapor hazırlanabilir ya da HTML formatında da.

C# Kod Örneği:

```csharp
// Metot iskeletimizi ve soyutlanmış metotları içermektedir.
// UML diyagramındaki AbstractClass yapısına denk gelmektedir.
abstract class DataAnalyzerBase
{
    // Metot iskeletimiz.
    public void AnalyzeDataOfLastWeek()
    {
        object data = GetDataOfLastWeek();
        object result = AnalyzeData(data);
        ExportResult(result);
    }

    private object GetDataOfLastWeek()
    {
        // Burada veri verinin çağrılma süreçleri yer alacaktır.
        // Default olarak bir obje dönülmektedir.
        Console.WriteLine("Method worked: GetDataOfLastWeek");
        return new object();
    }

    private object AnalyzeData(object data)
    {
        // Burada verinin analizi süreci yer almaktadır.
        // Analiz sonuçları default olarak bir obje dönmektedir.
        Console.WriteLine("Method worked: AnalyzeData");
        return new object();
    }

    // Alt sınıflar tarafından uygulanmasını istediğimiz metottur.
    // Metot iskeleti içerisinde farklılık gösterecek olan metotumuzdur.
    public abstract void ExportResult(object result);
```

```csharp
// UML diyagramındaki AbstractClass (DataAnalyzerBase) sınıfından türer.
// UML diyagramındaki ConcreteClass yapısına denk gelmektedir.
class HtmlDataAnalyzer : DataAnalyzerBase
{
    public override void ExportResult(object result)
    {
        // Durumun HTML'e dönüştürülmesi işlemleri yer alacaktır.
        Console.WriteLine("HTML exported.");
    }
}
```

```csharp
// UML diyagramındaki AbstractClass (DataAnalyzerBase) sınıfından türer.
// UML diyagramındaki ConcreteClass yapısına denk gelmektedir.
class XmlDataAnalyzer : DataAnalyzerBase
{
    public override void ExportResult(object result)
    {
        // Durumun XML'e dönüştürülmesi işlemleri yer alacaktır.
        Console.WriteLine("XML exported.");
    }
}
```

```csharp
DataAnalyzerBase dataAnalyzer;

dataAnalyzer = new XmlDataAnalyzer();
dataAnalyzer.AnalyzeDataOfLastWeek();
// output:
//  Method worked: GetDataOfLastWeek
//  Method worked: AnalyzeData
//  XML exported.

dataAnalyzer = new HtmlDataAnalyzer();
dataAnalyzer.AnalyzeDataOfLastWeek();
// output:

//  Method worked: GetDataOfLastWeek
//  Method worked: AnalyzeData
//  HTML exported.
```

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını [bu tasarım deseni için oluşturulmuş klasörde](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/tree/master/template-method) bulabilirsiniz.*