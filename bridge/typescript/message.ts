import {IMessageSender} from "./message-sender.interface";

// UML diyagramındaki Abstraction kısmına denk gelmektedir.
// Implementor (IMessageSender) arayüzünün referansını tutmaktadır.
export abstract class Message {
  protected constructor(protected readonly messageSender: IMessageSender) {}

  public abstract send(): Promise<void>;
}
