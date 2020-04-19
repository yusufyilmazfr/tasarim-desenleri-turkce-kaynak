package TemplateMethod;

// UML diyagramındaki AbstractClass (DataAnalyzerBase) sınıfından türer.
// UML diyagramındaki ConcreteClass yapısına denk gelmektedir.
class XmlDataAnalyzer extends DataAnalyzerBase {
    @Override
    public void exportResult(Object result) {
        // Durumun XML'e dönüştürülmesi işlemleri yer alacaktır.
        System.out.println("XML exported.");
    }
}