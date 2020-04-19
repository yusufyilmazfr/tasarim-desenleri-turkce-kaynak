package TemplateMethod

// UML diyagramındaki AbstractClass (DataAnalyzerBase) sınıfından türer.
// UML diyagramındaki ConcreteClass yapısına denk gelmektedir.
internal class HtmlDataAnalyzer : DataAnalyzerBase() {
    override fun exportResult(result: Any) {
        // Durumun HTML'e dönüştürülmesi işlemleri yer alacaktır.
        println("HTML exported.")
    }
}
