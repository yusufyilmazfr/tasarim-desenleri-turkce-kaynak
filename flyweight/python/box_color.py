from enum import Enum


class BoxColor(Enum):
    """
    Diğer dillerde Enum kendi kendine değer atama işlemi yaparken (c# örneğine bakabilirsiniz) Python
    Enum'ın değerini atama işlemini varsayılanda geliştiriciye bırakmıştır. Ancak otomatize etmek istenildiği
    takdirde bu class şu şekilde de yazılabilir:
    from enum import Enum, auto
    class BoxColor(Enum):
        Black = auto()
        Blue = auto()
    Ayrıca python Enum'ı kendi içerisinde alabileceği değişkenler bazında operatörler ile kullanabilmek için
    IntEnum, Flag gibi alt yapılar şeklinde kullanmaya da izin verir.
    Daha fazla bilgi için: https://docs.python.org/3/library/enum.html
    """
    Black = 1
    Blue = 2
