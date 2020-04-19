package TemplateMethod;

// UML diyagramındaki AbstractClass (DataAnalyzerBase) sınıfından türer.
// UML diyagramındaki ConcreteClass yapısına denk gelmektedir.
class HtmlDataAnalyzer extends DataAnalyzerBase {
    @Override
    public void exportResult(Object result) {
        // Durumun HTML'e dönüştürülmesi işlemleri yer alacaktır.
        System.out.println("HTML exported.");
    }
}
