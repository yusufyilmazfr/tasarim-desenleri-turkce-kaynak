import {IChatRoomMediator} from "./chat-room.interface";

// Haberleşme için ortak bir arayüz sağlar.
// Haberleşme Mediator tarafından gerçekleşeceği için bir örneğini tutar.
// Mesaj alma ve mesaj gönderme özellikleri içermektedir.
// UML diyagramındaki Colleague yapısına denk gelir.
export class User {
  public id: number;
  public name: string;

  constructor(public readonly chatRoomMediator: IChatRoomMediator) {}

  public receiveMessage(message: string): void {
    console.log(`${this.name} received new message. Message ${message}`);
  }

  public sendMessage(message: string, userId: number): void {
    console.log(`${this.name} send new message to: ${userId} id user.`);
    this.chatRoomMediator.sendMessage(message, userId);
  }
}
