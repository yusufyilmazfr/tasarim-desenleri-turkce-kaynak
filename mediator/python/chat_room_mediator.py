# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 21.12.2021
from abstract_chat_room_mediator import AbstractChatRoomMediator
from chat_user import ChatUser


class ChatRoomMediator(AbstractChatRoomMediator):
    """
    Mediator (IChatRoomMediator) arayüzünü uygular.
    Colleague (User) nesneleri arasındaki iletişimi koordine eder.
    UML diyagramındaki ConcreteMediator yapısına denk gelmektedir.
    """

    def __init__(self):
        self._user_dictionary = {}

    def send_message(self, message: str, user_id: int):
        user: ChatUser = self._user_dictionary[user_id]
        user.receive_message(message)

    def add_user_in_room(self, user: ChatUser):
        self._user_dictionary[user.u_id] = user
