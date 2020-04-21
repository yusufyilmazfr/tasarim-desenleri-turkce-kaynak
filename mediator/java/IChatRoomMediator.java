package Mediator;


// Colleague (User) nesneler arasındaki iletişim arayüzünü tanımlar.
// UML diyagramındaki Mediator arayüzüne denk gelmektedir.
interface IChatRoomMediator {
    void sendMessage(String message, int userId);
    void addUserInRoom(User user);
}
