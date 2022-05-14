import {ObservableProduct} from "./observable-product";

// Observer sınıfından türer.
// UML diyagramındaki ConcreteObservable yapısına denk gelmektedir.
export class Samsung extends ObservableProduct {
  // Ürün fiyatı değiştikten sonra Observer örneklerine bildirim gönderilir.
  public changePrice(): void {
    // Ürün fiyatlarının güncellenmesi vs.
    this.message.productName = 'Samsung';
    this.message.message = 'Samsung\'s price updated';
    this.notifyObserver();
  }
}
