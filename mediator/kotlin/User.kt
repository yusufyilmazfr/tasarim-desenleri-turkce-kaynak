package Mediator

// Haberleşme için ortak bir arayüz sağlar.
// Haberleşme Mediator tarafından gerçekleşeceği için bir örneğini tutar.
// Mesaj alma ve mesaj gönderme özellikleri içermektedir.
// UML diyagramındaki Colleague yapısına denk gelir.
internal abstract class User(private val _chatRoomMediator: IChatRoomMediator) {
    var id: Int = 0
    var name: String? = null

    fun receiveMessage(message: String) {
        val result = String.format("%s received new message. Message: %s", name, message)
        println(result)
    }

    fun sendMessage(message: String, userId: Int) {
        val result = String.format("%s send new message to: %d id user.", name, userId)
        println(result)

        _chatRoomMediator.sendMessage(message, userId)
    }
}
