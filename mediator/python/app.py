from chat_room_mediator import ChatRoomMediator
from chat_user import ChatUser

if __name__ == '__main__':
    chat_room = ChatRoomMediator()

    # Sohbet odasına dahil olacak kullanıcıların oluşturulması.
    # Ortak Mediator arayüzü ile haberleşmesi.
    sezer = ChatUser(chat_room)
    # SYB: python yanyana atama yapmaya imkan tanıdığı için tek satırda tanımlama yapma örneklenmiştir.
    # bir alt kullanıcı da yapılan atama ile bir farkı yoktur.
    sezer.u_id, sezer.name = 1, "Sezer"

    yusuf = ChatUser(chat_room)
    yusuf.u_id = 2
    yusuf.name = "Yusuf"

    sema = ChatUser(chat_room)
    sema.u_id = 3
    sema.name = "Semanur"

    aleyna = ChatUser(chat_room)
    aleyna.u_id = 4
    aleyna.name = "Aleyna"

    # Mediator içerisindeki kullanıcı listesine atama işlemleri.
    chat_room.add_user_in_room(sezer)
    chat_room.add_user_in_room(yusuf)
    chat_room.add_user_in_room(sema)
    chat_room.add_user_in_room(aleyna)

    yusuf.send_message("Naber kız?", sema.u_id)
    sema.send_message("Sanane be?", yusuf.u_id)

    """
    output:
    Yusuf send new message to: 3 id user.
    Semanur received new message. Message: Naber kız?
    Semanur send new message to: 2 id user.
    Yusuf received new message. Message: Sanane be?
    """
