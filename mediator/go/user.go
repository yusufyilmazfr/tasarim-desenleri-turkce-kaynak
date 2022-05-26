package main

import "fmt"

// User Haberleşme için ortak bir arayüz sağlar.
// Haberleşme Mediator tarafından gerçekleşeceği için bir örneğini tutar.
// Mesaj alma ve mesaj gönderme özellikleri içermektedir.
// UML diyagramındaki Colleague yapısına denk gelir.
type User struct {
	ID               int
	Name             string
	chatRoomMediator ChatRoom
}

func NewUser(chatRoomMediator ChatRoom, id int, name string) *User {
	return &User{
		ID:               id,
		Name:             name,
		chatRoomMediator: chatRoomMediator,
	}
}

func (u User) ReceiveMessage(msg string) {
	fmt.Printf("%s received new message. Message : %s\n", u.Name, msg)
}

func (u User) SendMessage(msg string, userID int) {
	fmt.Printf("%s sent new message to: %d id User.\n", u.Name, userID)

	u.chatRoomMediator.SendMessage(msg, userID)
}
