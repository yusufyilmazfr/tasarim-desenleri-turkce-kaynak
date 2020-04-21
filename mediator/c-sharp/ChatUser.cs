using System;
using System.Collections.Generic;
using System.Text;

namespace Mediator
{
    // Colleague (User) soyutundan türer.
    // Mediator sayesinde diğer sınıf örnekler ile iletişim kurar.
    // UML diyagramındaki ConcreteColleague yapısına denk gelmektedir.
    class ChatUser : User
    {
        public ChatUser(IChatRoomMediator chatRoomMediator) : base(chatRoomMediator)
        {

        }
    }
}
