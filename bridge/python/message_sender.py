from abc import ABC, abstractmethod


class MessageSender(ABC):
    @abstractmethod
    def send_message(self, message):
        pass
