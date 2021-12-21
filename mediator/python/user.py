# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 21.12.2021
from abc import ABC


class User(ABC):
    """
    Haberleşme için ortak bir arayüz sağlar.
    Haberleşme Mediator tarafından gerçekleşeceği için bir örneğini tutar.
    Mesaj alma ve mesaj gönderme özellikleri içermektedir.
    UML diyagramındaki Colleague yapısına denk gelir.
    """
    u_id: int
    name: str

    def __init__(self, chat_room_mediator):
        self._chat_room_mediator = chat_room_mediator

    def receive_message(self, message: str):
        print(f"{self.name} received new message. Message: {message}")

    def send_message(self, message: str, user_id):
        print(f"{self.name} send new message to: {user_id} id user.")
        self._chat_room_mediator.send_message(message, user_id)
