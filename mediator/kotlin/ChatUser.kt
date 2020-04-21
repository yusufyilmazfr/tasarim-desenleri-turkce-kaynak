package Mediator

// Colleague (User) soyutundan türer.
// Mediator sayesinde diğer sınıf örnekler ile iletişim kurar.
// UML diyagramındaki ConcreteColleague yapısına denk gelmektedir.
internal class ChatUser(chatRoomMediator: IChatRoomMediator) : User(chatRoomMediator)
