package Mediator;

import java.util.Dictionary;
import java.util.Hashtable;

// Mediator (IChatRoomMediator) arayüzünü uygular.
// Colleague (User) nesneleri arasındaki iletişimi koordine eder.
// UML diyagramındaki ConcreteMediator yapısına denk gelmektedir.
class ChatRoomMediator implements IChatRoomMediator {
    private Dictionary<Integer, User> _userDictionary;

    public ChatRoomMediator() {
        _userDictionary = new Hashtable<>();
    }

    public void addUserInRoom(User user) {
        _userDictionary.put(user.id, user);
    }

    public void sendMessage(String message, int userId) {
        User user = _userDictionary.get(userId);
        user.receiveMessage(message);
    }
}