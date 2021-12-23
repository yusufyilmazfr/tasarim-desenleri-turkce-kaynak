from data_analyzer_base import DataAnalyzerBase


class XmlDataAnalyzer(DataAnalyzerBase):
    """
    UML diyagramındaki AbstractClass (DataAnalyzerBase) sınıfından türer.
    UML diyagramındaki ConcreteClass yapısına denk gelmektedir.
    """

    def export_result(self, result: object):
        # Durumun XML'e dönüştürülmesi işlemleri yer alacaktır.
        print("XML exported.")
