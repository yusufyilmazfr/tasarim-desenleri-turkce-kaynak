import {User} from "./user";

// Colleague (User) nesneler arasındaki iletişim arayüzünü tanımlar.
// UML diyagramındaki Mediator arayüzüne denk gelmektedir.
export interface IChatRoomMediator {
  sendMessage(message: string, userId: number): void;
  addUserInRoom(user: User): void;
}
