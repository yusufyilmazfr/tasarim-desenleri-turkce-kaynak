from abc import ABC, abstractmethod


class Iterator(ABC):
    """
    Koleksiyon üzerinde dolaşmak için operasyonların tanımlandığı arayüzdür.
    Bir sonraki elemana geçme, bir sonraki elemanın olup olmadığı gibi.
    UML diyagramındaki Iterator arayüzüne denk gelmektedir.
    Generic bir yapı sağlanarak birçok yerde kullanılması sağlanır.
    """

    @abstractmethod
    def has_next(self):
        pass

    @abstractmethod
    def get_current_item(self):
        pass
