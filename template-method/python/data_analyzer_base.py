from abc import abstractmethod


class DataAnalyzerBase:
    """
    Metot iskeletimizi ve soyutlanmış metotları içermektedir.
    UML diyagramındaki AbstractClass yapısına denk gelmektedir.
    """
    data: object
    result: object

    def analyze_data_of_last_week(self):
        # Metot iskeletimiz.
        self.data = self.get_data_of_last_week()
        self.result = self.analyze_data(self.data)
        self.export_result(self.result)

    def get_data_of_last_week(self):
        # Burada veri verinin çağrılma süreçleri yer alacaktır.
        # Default olarak bir obje dönülmektedir.
        print("Method worked: GetDataOfLastWeek")
        return object()

    def analyze_data(self, data: object):
        # Burada verinin analizi süreci yer almaktadır.
        # Analiz sonuçları default olarak bir obje dönmektedir.
        print("Method worked: AnalyzeData")
        return object()

    # Alt sınıflar tarafından uygulanmasını istediğimiz metottur.
    # Metot iskeleti içerisinde farklılık gösterecek olan metotumuzdur.
    @abstractmethod
    def export_result(self, result: object):
        pass
