import {IObserverUser} from "./observer-user.interface";
import {ProductUpdateMessage} from "./product-update-message";

// Observer arayüzünü uygulayan, değişimi takip eden sınıflardır.
// Değişim update metotu ile bildirilir.
// UML diyagramındaki ConcreteObserver yapısına denk gelmektedir.
export class ObserverUser implements IObserverUser {
  sendNotification(message: ProductUpdateMessage): void {
    console.log(message.toString());
  }
}
