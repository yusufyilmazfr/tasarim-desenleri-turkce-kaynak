import {ProductUpdateMessage} from "./product-update-message";

// Değişimden etkilenecek, izleyecek olan sınıfların uyguladığı arayüzdür.
// UML diyagramındaki Observer yapısına denk gelmektedir.
export interface IObserverUser {
  sendNotification(message: ProductUpdateMessage): void;
}
