package Observer

// Observer arayüzünü uygulayan, değişimi takip eden sınıflardır.
// Değişim update metotu ile bildirilir.
// UML diyagramındaki ConcreteObserver yapısına denk gelmektedir.
internal class ObserverUser : IObserverUser {
    override fun sendNotification(message: ProductUpdateMessage) {
        println(message.toString())
    }
}