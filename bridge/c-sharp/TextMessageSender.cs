using System;
using System.Collections.Generic;
using System.Text;

namespace Bridge
{
    // UML diyagramındaki ConcreteImplementor (TextMessageSender) kısmına denk gelmektedir.
    // Implementor arayüzünü (IMessageSender) uygular.
    public class TextMessageSender : IMessageSender
    {
        public void SendMessage(Message message)
        {
            Console.WriteLine("TextMessageSender: Sending text message...");
        }
    }
}
