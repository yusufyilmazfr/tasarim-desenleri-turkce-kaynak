import {Message} from "./message";

// UML diyagramındaki Implementor (IMessageSender) arayüzünen denk gelmektedir.
// Abstraction (Message) tarafından referansı tutulur ve haberleşme burası ile gerçekleşir.
export interface IMessageSender {
  sendMessage(message: Message): Promise<void>;
}
