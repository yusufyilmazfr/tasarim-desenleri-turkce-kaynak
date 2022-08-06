package main

// ChatRoom Colleague (User) nesneler arasındaki iletişim arayüzünü tanımlar.
// UML diyagramindaki Mediator arayüzüne denk gelmektedir.
type ChatRoom interface {
	SendMessage(message string, userID int)
	AddUserInRoom(user *User)
}
