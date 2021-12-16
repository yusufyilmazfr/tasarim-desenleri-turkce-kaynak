# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 16.12.2021
from abc import ABC, abstractmethod


class MessageSender(ABC):
    @abstractmethod
    def send_message(self, message):
        pass
