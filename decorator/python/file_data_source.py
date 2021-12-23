from data_source import DataSource


class FileDataSource(DataSource):
    """
    Temel işlemlerin tanımlandığı IDataSource arayüzünü uygulayan sınıftır.
    UML diyagramındaki ConcreteComponent sınıfına denk gelmektedir.
    """

    def __init__(self, file_name):
        self.file_name = file_name

    def get_file_name(self):
        return self.file_name

    def write_data(self, data):
        print(f"data was written to {self.file_name}.")

    def read_data(self):
        print(f"{self.file_name} readed.")
