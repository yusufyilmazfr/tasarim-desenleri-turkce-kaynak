package TemplateMethod;

// Metot iskeletimizi ve soyutlanmış metotları içermektedir.
// UML diyagramındaki AbstractClass yapısına denk gelmektedir.
abstract class DataAnalyzerBase {

    // Metot iskeletimiz.
    public void analyzeDataOfLastWeek() {
        Object data = getDataOfLastWeek();
        Object result = analyzeData(data);
        exportResult(result);
    }

    private Object getDataOfLastWeek() {
        // Burada veri verinin çağrılma süreçleri yer alacaktır.
        // Default olarak bir obje dönülmektedir.
        System.out.println("Method worked: GetDataOfLastWeek");
        return new Object();
    }

    private Object analyzeData(Object data) {
        // Burada verinin analizi süreci yer almaktadır.
        // Analiz sonuçları default olarak bir obje dönmektedir.
        System.out.println("Method worked: AnalyzeData");
        return new Object();
    }

    // Alt sınıflar tarafından uygulanmasını istediğimiz metottur.
    // Metot iskeleti içerisinde farklılık gösterecek olan metotumuzdur.
    public abstract void exportResult(Object result);
}
