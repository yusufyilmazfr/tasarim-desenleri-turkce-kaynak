using System;
using System.Collections.Generic;
using System.Text;

namespace Bridge
{
    // UML diyagramındaki Abstraction kısmına denk gelmektedir.
    // Implementor (IMessageSender) arayüzünün referansını tutmaktadır.
    public abstract class Message
    {
        protected IMessageSender messageSender;

        public Message(IMessageSender messageSender)
        {
            this.messageSender = messageSender;
        }

        public abstract void Send();
    }
}
