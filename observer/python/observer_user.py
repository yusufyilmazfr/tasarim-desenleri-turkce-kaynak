from abstract_observer_user import AbstractObserverUser
from observer.python.product_update_message import ProductUpdateMessage


class ObserverUser(AbstractObserverUser):
    """
    Observer arayüzünü uygulayan, değişimi takip eden sınıflardır.
    Değişim update metotu ile bildirilir.
    UML diyagramındaki ConcreteObserver yapısına denk gelmektedir.
    """

    def send_notification(self, message: ProductUpdateMessage):
        print(message)
