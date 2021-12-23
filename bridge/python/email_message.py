from message import Message


class EmailMessage(Message):

    def send(self):
        self.message_sender.send_message(self)
