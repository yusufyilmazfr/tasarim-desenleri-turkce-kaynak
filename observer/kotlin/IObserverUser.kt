package Observer

// Değişimden etkilenecek, izleyecek olan sınıfların uyguladığı arayüzdür.
// UML diyagramındaki Observer yapısına denk gelmektedir.
internal interface IObserverUser {
    fun sendNotification(message: ProductUpdateMessage)
}