package Mediator;

// Colleague (User) soyutundan türer.
// Mediator sayesinde diğer sınıf örnekler ile iletişim kurar.
// UML diyagramındaki ConcreteColleague yapısına denk gelmektedir.
class ChatUser extends User {
    public ChatUser(IChatRoomMediator chatRoomMediator) {
        super(chatRoomMediator);
    }
}
