package main

// Mediator (IChatRoomMediator) arayüzünü uygular.
// Colleague (User) nesneleri arasındaki iletişimi koordine eder.
// UML diyagramındaki ConcreteMediator yapısına denk gelmektedir.
type chatRoomMediator struct {
	users map[int]*User
}

func NewChatRoomMediator() *chatRoomMediator {
	return &chatRoomMediator{
		users: make(map[int]*User),
	}
}

func (m *chatRoomMediator) AddUserInRoom(user *User) {
	m.users[user.ID] = user
}

func (m chatRoomMediator) SendMessage(message string, userID int) {
	user, k := m.users[userID]
	if !k {
		return
	}
	user.ReceiveMessage(message)
}
