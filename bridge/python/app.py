# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 16.12.2021
from text_message import TextMessage
from text_message_sender import TextMessageCenter
from email_message_sender import EmailMessageSender
from email_message import EmailMessage

if __name__ == '__main__':
    text_message_sender = TextMessageCenter()
    text_message = TextMessage(text_message_sender)
    text_message.send()

    email_message_sender = EmailMessageSender()
    email_message = EmailMessage(email_message_sender)
    email_message.send()
