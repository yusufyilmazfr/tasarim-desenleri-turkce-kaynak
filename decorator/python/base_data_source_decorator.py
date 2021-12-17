# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 17.12.2021
from abc import ABC, ABCMeta
from data_source import DataSource

"""
SYB: Abstract bir class'tan başka bir abstract class tanimlamanin birden cok
yolu mevcuttur. metaclass argümanını kullanarakta, DataSource'dan sonra direkt ABC
class'ını çağırarakta abstract class yapmak mümkündür. Burada örnek diğer yöntemi
göstersin diye metaclass kullanılmıştır. Her iki durumda da child class en üstteki
class'ın belirttiği abstract metodları implemente etmekle mükelleftir.
"""


class BaseDataSourceDecorator(DataSource, metaclass=ABCMeta):
    """
    UML diyagramındaki Component (IDataSource) arayüzünü uygular.
    Constructor sayesinde özellikleri değiştirilmesi istenen nesnenin referansı tutulur.
    Değiştirilmesini istediğimiz metotları abstract anahtar kelimesi ile işaretledik.
    UML diyagramındaki BaseDecorator yapısına denk gelmektedir.
    """
    def __init__(self, data_source: DataSource):
        self.data_source = data_source
