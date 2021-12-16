# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 16.12.2021
from message import Message


class TextMessage(Message):

    def send(self):
        self.message_sender.send_message(self)
