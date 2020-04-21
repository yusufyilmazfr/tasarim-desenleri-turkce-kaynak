package Observer;

// Observer arayüzünü uygulayan, değişimi takip eden sınıflardır.
// Değişim update metotu ile bildirilir.
// UML diyagramındaki ConcreteObserver yapısına denk gelmektedir.
class ObserverUser implements IObserverUser {
    public void sendNotification(ProductUpdateMessage message) {
        System.out.println(message.toString());
    }
}