using System;

namespace Bridge
{
    class Program
    {
        static void Main(string[] args)
        {
            IMessageSender textMessageSender = new TextMessageSender();
            Message textMessage = new TextMessage(textMessageSender);
            textMessage.Send(); // output: TextMessageSender: Sending text message...

            IMessageSender emailMessageSender = new EmailMessageSender();
            Message emailMessage = new TextMessage(emailMessageSender);
            emailMessage.Send(); // output: EmailMessageSender: Sending email message...
        }
    }
}
