package Mediator

fun main(args: Array<String>) {
    val chatRoom = ChatRoomMediator()

    // Sohbet odasına dahil olacak kullanıcıların oluşturulması.
    // Ortak Mediator arayüzü ile haberleşmesi.
    val yusuf = ChatUser(chatRoom)
    yusuf.id = 1
    yusuf.name = "Yusuf"

    val sema = ChatUser(chatRoom)
    sema.id = 2
    sema.name = "Semanur"

    val derya = ChatUser(chatRoom)
    derya.id = 3
    derya.name = "Derya"

    val aleyna = ChatUser(chatRoom)
    aleyna.id = 4
    aleyna.name = "Aleyna"

    // Mediator içerisindeki kullanıcı listesine atama işlemleri.
    chatRoom.addUserInRoom(yusuf)
    chatRoom.addUserInRoom(sema)
    chatRoom.addUserInRoom(derya)
    chatRoom.addUserInRoom(aleyna)

    yusuf.sendMessage("Naber kız?", sema.id)
    sema.sendMessage("Sanane be?", yusuf.id)

    // output:
    //  Yusuf send new message to: 2 id user.
    //  Semanur received new message.Message: Naber kız?
    //  Semanur send new message to: 1 id user.
    //  Yusuf received new message.Message: Sanane be?
}