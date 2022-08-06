package main

// Colleague (User) soyutundan türer.
// Mediator sayesinde diğer sınıf örnekler ile iletişim kurar.
// UML diyagramındaki ConcreteColleague yapısına denk gelmektedir.
type chatUser struct {
	User *User
}

func NewChatUser(mediator ChatRoom, id int, name string) *chatUser {
	return &chatUser{
		User: NewUser(mediator, id, name),
	}
}
