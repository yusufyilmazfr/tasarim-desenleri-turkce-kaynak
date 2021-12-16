# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 16.12.2021
from message_sender import MessageSender


class TextMessageCenter(MessageSender):
    def send_message(self, message):
        print("TextMessageSender: Sending text message...")
