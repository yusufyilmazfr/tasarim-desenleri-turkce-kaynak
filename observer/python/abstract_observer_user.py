from abc import ABC, abstractmethod
from product_update_message import ProductUpdateMessage


class AbstractObserverUser(ABC):
    """
    Değişimden etkilenecek, izleyecek olan sınıfların uyguladığı arayüzdür.
    UML diyagramındaki Observer yapısına denk gelmektedir.
    """

    @abstractmethod
    def send_notification(self, message: ProductUpdateMessage):
        pass
