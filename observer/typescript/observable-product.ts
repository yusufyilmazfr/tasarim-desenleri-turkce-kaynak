import {IObserverUser} from "./observer-user.interface";
import {ProductUpdateMessage} from "./product-update-message";

// Takip edilecek olan yapımızdır.
// İçerisinde Observer (değişimden etkilenecek) nesneleri tutar.
// UML diyagramındaki Observable yapısına denk gelmektedir.
export abstract class ObservableProduct {
  private users = new Set<IObserverUser>();
  protected message = new ProductUpdateMessage();

  public addObserver(observerUser: IObserverUser): void {
    this.users.add(observerUser);
  }

  public removeObserver(observerUser: IObserverUser): void {
    this.users.delete(observerUser);
  }

  public notifyObserver(): void {
    for (let user of this.users) {
      user.sendNotification(this.message);
    }
  }
}
