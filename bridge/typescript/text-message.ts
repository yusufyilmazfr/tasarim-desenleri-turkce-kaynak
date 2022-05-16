import {Message} from "./message";
import {IMessageSender} from "./message-sender.interface";

// UML diyagramındaki RefinedAbstraction kısmına denk gelmektedir.
// Abstraction (Message) sınıfından türer.
export class TextMessage extends Message {
  constructor(protected readonly messageSender: IMessageSender) {
    super(messageSender);
  }

  public send(): void {
   this.messageSender.sendMessage(this);
  }
}
