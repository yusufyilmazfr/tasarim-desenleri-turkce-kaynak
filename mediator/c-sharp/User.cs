using System;
using System.Collections.Generic;
using System.Text;

namespace Mediator
{
    // Haberleşme için ortak bir arayüz sağlar.
    // Haberleşme Mediator tarafından gerçekleşeceği için bir örneğini tutar.
    // Mesaj alma ve mesaj gönderme özellikleri içermektedir.
    // UML diyagramındaki Colleague yapısına denk gelir.
    abstract class User
    {
        public int id;
        public string name;

        private IChatRoomMediator _chatRoomMediator;

        public User(IChatRoomMediator chatRoomMediator)
        {
            _chatRoomMediator = chatRoomMediator;
        }

        public void ReceiveMessage(string message)
        {
            Console.WriteLine($"{name} received new message. Message: {message}");
        }

        public void SendMessage(string message, int userId)
        {
            Console.WriteLine($"{name} send new message to: {userId} id user.");
            _chatRoomMediator.SendMessage(message, userId);
        }
    }
}
