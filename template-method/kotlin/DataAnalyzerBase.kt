package TemplateMethod

// Metot iskeletimizi ve soyutlanmış metotları içermektedir.
// UML diyagramındaki AbstractClass yapısına denk gelmektedir.
internal abstract class DataAnalyzerBase {

    // Burada veri verinin çağrılma süreçleri yer alacaktır.
    // Default olarak bir obje dönülmektedir.
    private fun getDataOfLastWeek(): Any {
        println("Method worked: GetDataOfLastWeek")
        return Any()
    }

    // Metot iskeletimiz.
    fun analyzeDataOfLastWeek() {
        val data = getDataOfLastWeek()
        val result = analyzeData(data)
        exportResult(result)
    }

    private fun analyzeData(data: Any): Any {
        // Burada verinin analizi süreci yer almaktadır.
        // Analiz sonuçları default olarak bir obje dönmektedir.
        println("Method worked: AnalyzeData")
        return Any()
    }

    // Alt sınıflar tarafından uygulanmasını istediğimiz metottur.
    // Metot iskeleti içerisinde farklılık gösterecek olan metotumuzdur.
    abstract fun exportResult(result: Any)
}
