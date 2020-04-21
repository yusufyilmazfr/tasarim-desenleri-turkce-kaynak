package Observer

// Observer sınıfından türer.
// UML diyagramındaki ConcreteObservable yapısına denk gelmektedir.
internal class Samsung : ObservableProduct() {

    // Ürün fiyatı değiştikten sonra Observer örneklerine bildirim gönderilir.
    fun changePrice() {
        // Ürün fiyatlarının güncellenmesi vs.

        this.message.productName = "Samsung"
        this.message.message = "Samsung's price updated."
        this.notifyObserver()
    }
}
