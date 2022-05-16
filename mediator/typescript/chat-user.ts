import {User} from "./user";
import {IChatRoomMediator} from "./chat-room.interface";

// Colleague (User) soyutundan türer.
// Mediator sayesinde diğer sınıf örnekler ile iletişim kurar.
// UML diyagramındaki ConcreteColleague yapısına denk gelmektedir.
export class ChatUser extends User {
  constructor(public chatRoomMediator: IChatRoomMediator) {
    super(chatRoomMediator);
  }
}
