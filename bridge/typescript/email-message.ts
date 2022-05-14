import {Message} from "./message";
import {IMessageSender} from "./message-sender.interface";

// UML diyagramındaki RefinedAbstraction kısmına denk gelmektedir.
// Abstraction (Message) sınıfından türer.
export class EmailMessage extends Message {
  constructor(protected readonly messageSender: IMessageSender) {
    super(messageSender);
  }

  async send(): Promise<void> {
    await this.messageSender.sendMessage(this);
  }
}
