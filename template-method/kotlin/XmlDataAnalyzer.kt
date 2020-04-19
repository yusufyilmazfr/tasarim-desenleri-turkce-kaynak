package TemplateMethod

// UML diyagramındaki AbstractClass (DataAnalyzerBase) sınıfından türer.
// UML diyagramındaki ConcreteClass yapısına denk gelmektedir.
internal class XmlDataAnalyzer : DataAnalyzerBase() {
    override fun exportResult(result: Any) {
        // Durumun XML'e dönüştürülmesi işlemleri yer alacaktır.
        println("XML exported.")
    }
}