from message_sender import MessageSender


class TextMessageCenter(MessageSender):
    def send_message(self, message):
        print("TextMessageSender: Sending text message...")
