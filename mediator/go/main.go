package main

func main() {
	chatRoom := NewChatRoomMediator()

	// Sohbet odasına dahil olacak kullanıcıların oluşturulması.
	// Ortak Mediator arayüzü ile haberleşmesi.
	yusuf := NewChatUser(chatRoom, 1, "Yusuf")
	sema := NewChatUser(chatRoom, 2, "Sema")
	derya := NewChatUser(chatRoom, 3, "Derya")
	aleyna := NewChatUser(chatRoom, 4, "Aleyna")

	// Mediator içerisindeki kullanıcı listesine atama işlemleri.
	chatRoom.AddUserInRoom(yusuf.User)
	chatRoom.AddUserInRoom(sema.User)
	chatRoom.AddUserInRoom(derya.User)
	chatRoom.AddUserInRoom(aleyna.User)

	yusuf.User.SendMessage("Merhaba sema", sema.User.ID)
	sema.User.SendMessage("Merhaba yusuf", yusuf.User.ID)

	// output:
	//  Yusuf send new message to: 2 id User.
	//  Semanur received new message.Message: Merhaba sema
	//  Semanur send new message to: 1 id User.
	//  Yusuf received new message.Message: Merhaba yusuf
}
