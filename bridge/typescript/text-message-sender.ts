import {IMessageSender} from "./message-sender.interface";
import {Message} from "./message";

// UML diyagramındaki ConcreteImplementor (TextMessageSender) kısmına denk gelmektedir.
// Implementor arayüzünü (IMessageSender) uygular.
export class TextMessageSender implements IMessageSender {
  async sendMessage(message: Message): Promise<void> {
    console.log('TextMessageSender: Sending text message...');
  }
}
