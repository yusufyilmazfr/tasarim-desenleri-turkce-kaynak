from observable_product import ObservableProduct


class Samsung(ObservableProduct):
    """
    Observer sınıfından türer.
    UML diyagramındaki ConcreteObservable yapısına denk gelmektedir.
    """

    def change_price(self):
        # Ürün fiyatı değiştikten sonra Observer örneklerine bildirim gönderilir.
        # Ürün fiyatlarının güncellenmesi vs.
        self.message.product_name = "Samsung"
        self.message.message = "Samsung's price updated."
        self.notify_observer()
