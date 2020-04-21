package Mediator


// Colleague (User) nesneler arasındaki iletişim arayüzünü tanımlar.
// UML diyagramındaki Mediator arayüzüne denk gelmektedir.
internal interface IChatRoomMediator {
    fun sendMessage(message: String, userId: Int)
    fun addUserInRoom(user: User)
}
