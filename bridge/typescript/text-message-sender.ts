import {IMessageSender} from "./message-sender.interface";
import {Message} from "./message";

// UML diyagramındaki ConcreteImplementor (TextMessageSender) kısmına denk gelmektedir.
// Implementor arayüzünü (IMessageSender) uygular.
export class TextMessageSender implements IMessageSender {
  public sendMessage(message: Message): void {
    console.log('TextMessageSender: Sending text message...');
  }
}
