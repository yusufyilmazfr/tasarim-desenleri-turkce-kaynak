from message import Message


class TextMessage(Message):

    def send(self):
        self.message_sender.send_message(self)
