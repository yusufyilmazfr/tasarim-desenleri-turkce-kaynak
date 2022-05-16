import {IMessageSender} from "./message-sender.interface";
import {Message} from "./message";

// UML diyagramındaki ConcreteImplementor (EmailMessageSender) kısmına denk gelmektedir.
// Implementor arayüzünü (IMessageSender) uygular.
export class EmailMessageSender implements IMessageSender {
  public sendMessage(message: Message): void {
    console.log('EmailMessageSender: Sending email message...');
  }
}
