# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 16.12.2021
from message_sender import MessageSender


class EmailMessageSender(MessageSender):
    def send_message(self, message):
        print("EmailMessageSender: Sending email message...")
