from message_sender import MessageSender


class EmailMessageSender(MessageSender):
    def send_message(self, message):
        print("EmailMessageSender: Sending email message...")
