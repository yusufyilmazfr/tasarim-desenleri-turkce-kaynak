using System;
using System.Collections.Generic;
using System.Text;

namespace Bridge
{
    // UML diyagramındaki ConcreteImplementor (EmailMessageSender) kısmına denk gelmektedir.
    // Implementor arayüzünü (IMessageSender) uygular.
    public class EmailMessageSender : IMessageSender
    {
        public void SendMessage(Message message)
        {
            Console.WriteLine("EmailMessageSender: Sending email message...");
        }
    }
}
