using System;
using System.Collections.Generic;
using System.Text;

namespace Mediator
{
    // Colleague (User) nesneler arasındaki iletişim arayüzünü tanımlar.
    // UML diyagramındaki Mediator arayüzüne denk gelmektedir.
    interface IChatRoomMediator
    {
        void SendMessage(string message, int userId);
        void AddUserInRoom(User user);
    }
}
