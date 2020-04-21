using System;
using System.Collections.Generic;
using System.Text;

namespace Observer
{
    // Observer sınıfından türer.
    // UML diyagramındaki ConcreteObservable yapısına denk gelmektedir.
    class Samsung : ObservableProduct
    {
        // Ürün fiyatı değiştikten sonra Observer örneklerine bildirim gönderilir.
        public void ChangePrice()
        {
            // Ürün fiyatlarının güncellenmesi vs.

            this.message.productName = "Samsung";
            this.message.message = "Samsung's price updated.";
            this.NotifyObserver();
        }
    }
}
