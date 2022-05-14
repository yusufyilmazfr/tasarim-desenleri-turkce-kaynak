import {IChatRoomMediator} from "./chat-room.interface";
import {User} from "./user";

// Mediator (IChatRoomMediator) arayüzünü uygular.
// Colleague (User) nesneleri arasındaki iletişimi koordine eder.
// UML diyagramındaki ConcreteMediator yapısına denk gelmektedir.
export class ChatRoomMediator implements IChatRoomMediator {
  private readonly userMap: Map<number, User>;

  constructor() {
    this.userMap = new Map<number, User>();
  }

  public addUserInRoom(user: User): void {
    this.userMap.set(user.id, user);
  }

  public sendMessage(message: string, userId: number): void {
    const user = this.userMap.get(userId);
    user.receiveMessage(message);
  }
}
