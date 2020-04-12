using System;
using System.Collections.Generic;
using System.Text;

namespace Bridge
{
    // UML diyagramındaki RefinedAbstraction kısmına denk gelmektedir.
    // Abstraction (Message) sınıfından türer.
    public class TextMessage : Message
    {
        public TextMessage(IMessageSender messageSender) : base(messageSender)
        {
        }

        public override void Send()
        {
            messageSender.SendMessage(this);
        }
    }
}
