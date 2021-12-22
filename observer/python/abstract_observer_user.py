# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 22.12.2021
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
