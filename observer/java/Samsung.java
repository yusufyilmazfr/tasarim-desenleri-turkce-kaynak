package Observer;

// Observer sınıfından türer.
// UML diyagramındaki ConcreteObservable yapısına denk gelmektedir.
class Samsung extends ObservableProduct {

    // Ürün fiyatı değiştikten sonra Observer örneklerine bildirim gönderilir.
    public void changePrice() {
        // Ürün fiyatlarının güncellenmesi vs.

        this.message.productName = "Samsung";
        this.message.message = "Samsung's price updated.";
        this.notifyObserver();
    }
}
