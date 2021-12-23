from data_analyzer_base import DataAnalyzerBase


class HtmlDataAnalyzer(DataAnalyzerBase):
    """
    UML diyagramındaki AbstractClass (DataAnalyzerBase) sınıfından türer.
    UML diyagramındaki ConcreteClass yapısına denk gelmektedir.
    """

    def export_result(self, result: object):
        # Durumun HTML'e dönüştürülmesi işlemleri yer alacaktır.
        print("HTML exported.")
