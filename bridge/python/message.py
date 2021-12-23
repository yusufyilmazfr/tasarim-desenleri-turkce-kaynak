from abc import ABC, abstractmethod
from message_sender import MessageSender


class Message(ABC):
    message_sender: MessageSender

    def __init__(self, message_sender: MessageSender):
        self.message_sender = message_sender

    @abstractmethod
    def send(self):
        pass
