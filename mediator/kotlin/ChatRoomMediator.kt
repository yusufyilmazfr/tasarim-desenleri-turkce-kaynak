package Mediator

import java.util.Dictionary
import java.util.Hashtable

// Mediator (IChatRoomMediator) arayüzünü uygular.
// Colleague (User) nesneleri arasındaki iletişimi koordine eder.
// UML diyagramındaki ConcreteMediator yapısına denk gelmektedir.
internal class ChatRoomMediator : IChatRoomMediator {
    private val _userDictionary: Dictionary<Int, User>

    init {
        _userDictionary = Hashtable()
    }

    override fun addUserInRoom(user: User) {
        _userDictionary.put(user.id, user)
    }

    override fun sendMessage(message: String, userId: Int) {
        val user = _userDictionary.get(userId)
        user.receiveMessage(message)
    }
}