# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 21.12.2021
from abc import ABC, abstractmethod


class AbstractChatRoomMediator(ABC):
    """
    Colleague (User) nesneler arasındaki iletişim arayüzünü tanımlar.
    UML diyagramındaki Mediator arayüzüne denk gelmektedir.
    """

    @abstractmethod
    def send_message(self, message: str, user_id: int):
        pass

    @abstractmethod
    def add_user_in_room(self, user):
        pass
