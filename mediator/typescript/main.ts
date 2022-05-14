import {ChatRoomMediator} from "./chat-room";
import {ChatUser} from "./chat-user";

function main() {
  const chatRoom = new ChatRoomMediator();

  // Sohbet odasına dahil olacak kullanıcıların oluşturulması.
  // Ortak Mediator arayüzü ile haberleşmesi.
  const yusuf = new ChatUser(chatRoom);
  yusuf.id = 1;
  yusuf.name = "Yusuf";

  const sema = new ChatUser(chatRoom);
  sema.id = 2;
  sema.name = "Semanur";

  const derya = new ChatUser(chatRoom);
  derya.id = 3;
  derya.name = "Derya";

  const aleyna = new ChatUser(chatRoom);
  aleyna.id = 4;
  aleyna.name = "Aleyna";

  // Mediator içerisindeki kullanıcı listesine atama işlemleri.
  chatRoom.addUserInRoom(yusuf);
  chatRoom.addUserInRoom(sema);
  chatRoom.addUserInRoom(derya);
  chatRoom.addUserInRoom(aleyna);

  yusuf.sendMessage("Naber kız?", sema.id);
  sema.sendMessage("Sanane be?", yusuf.id);
  // output:
  //  Yusuf send new message to: 2 id user.
  //  Semanur received new message.Message: Naber kız?
  //  Semanur send new message to: 1 id user.
  //  Yusuf received new message.Message: Sanane be?
}
