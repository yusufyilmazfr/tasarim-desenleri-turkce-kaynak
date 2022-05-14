import {IMessageSender} from "./message-sender.interface";
import {Message} from "./message";

// UML diyagramındaki ConcreteImplementor (EmailMessageSender) kısmına denk gelmektedir.
// Implementor arayüzünü (IMessageSender) uygular.
export class EmailMessageSender implements IMessageSender {
  public async sendMessage(message: Message): Promise<void> {
    console.log('EmailMessageSender: Sending email message...');
  }
}
