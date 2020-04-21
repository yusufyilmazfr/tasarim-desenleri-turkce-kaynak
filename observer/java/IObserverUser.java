package Observer;

// Değişimden etkilenecek, izleyecek olan sınıfların uyguladığı arayüzdür.
// UML diyagramındaki Observer yapısına denk gelmektedir.
interface IObserverUser {
    void sendNotification(ProductUpdateMessage message);
}