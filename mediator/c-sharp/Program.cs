using System;
using System.Collections.Generic;

namespace Mediator
{
    class Program
    {
        static void Main(string[] args)
        {
            IChatRoomMediator chatRoom = new ChatRoomMediator();

            // Sohbet odasına dahil olacak kullanıcıların oluşturulması.
            // Ortak Mediator arayüzü ile haberleşmesi.
            User yusuf = new ChatUser(chatRoom);
            yusuf.id = 1;
            yusuf.name = "Yusuf";

            User sema = new ChatUser(chatRoom);
            sema.id = 2;
            sema.name = "Semanur";

            User derya = new ChatUser(chatRoom);
            derya.id = 3;
            derya.name = "Derya";

            User aleyna = new ChatUser(chatRoom);
            aleyna.id = 4;
            aleyna.name = "Aleyna";

            // Mediator içerisindeki kullanıcı listesine atama işlemleri.
            chatRoom.AddUserInRoom(yusuf);
            chatRoom.AddUserInRoom(sema);
            chatRoom.AddUserInRoom(derya);
            chatRoom.AddUserInRoom(aleyna);

            yusuf.SendMessage("Naber kız?", sema.id);
            sema.SendMessage("Sanane be?", yusuf.id);

            // output:
            //  Yusuf send new message to: 2 id user.
            //  Semanur received new message.Message: Naber kız?
            //  Semanur send new message to: 1 id user.
            //  Yusuf received new message.Message: Sanane be?
        }
    }
}
