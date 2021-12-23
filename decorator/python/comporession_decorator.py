from base_data_source_decorator import BaseDataSourceDecorator


class ComporessionDecorator(BaseDataSourceDecorator):
    """
    Yeni davranışların tanımlandığı sınıftır.
    UML diyagramındaki BaseDecorator (BaseDataSourceDecorator) sınıfından türer.
    UML diyagramındaki ConcreteDecorator sınıfına denk gelmektedir.
    """

    def get_file_name(self):
        return self.data_source.get_file_name()

    def write_data(self, data):
        # Burada gelen veriye ait sıkıştırma işlemleri yapılacaktır.
        print("Data compressed.")

        # Sıkıştırma işlemleri yapıldıktan sonra yazma işlemleri gerçekleştirilecektir.
        print(f"Compressed data was written to {self.data_source.get_file_name()}")

    def read_data(self):
        # Veriyi okurken referansını tuttuğumuz sınıfın kendi davranışını sergilemesini istiyoruz.
        self.data_source.read_data()
