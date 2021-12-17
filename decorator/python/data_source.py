# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 17.12.2021
from abc import ABC, abstractmethod


class DataSource(ABC):
    """
    Üst sınıfların uygulayacağı arayüzdür.
    Yapılacak temel işlemler tanımlanmıştır.
    UML diyagramındaki Component arayüzüne denk gelmektedir.
    """

    @abstractmethod
    def get_file_name(self):
        pass

    @abstractmethod
    def write_data(self, data):
        pass

    @abstractmethod
    def read_data(self):
        pass
