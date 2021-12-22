# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 22.12.2021
from product_update_message import ProductUpdateMessage
from abstract_observer_user import AbstractObserverUser


class ObservableProduct:
    """
    Takip edilecek olan yapımızdır.
    İçerisinde Observer (değişimden etkilenecek) nesneleri tutar.
    UML diyagramındaki Observable yapısına denk gelmektedir.
    """

    def __init__(self):
        self._users = list()  # SYB: list() yerine direkt "[]" şeklinde tanımlama da yapılabilir.
        self.message = ProductUpdateMessage()

    def add_observer(self, observer_user: AbstractObserverUser):
        self._users.append(observer_user)

    def remove_observer(self, observer_user: AbstractObserverUser):
        self._users.remove(observer_user)

    def notify_observer(self):
        for user in self._users:  # type:AbstractObserverUser
            user.send_notification(self.message)
