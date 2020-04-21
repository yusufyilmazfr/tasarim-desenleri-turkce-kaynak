package Mediator;

// Haberleşme için ortak bir arayüz sağlar.
// Haberleşme Mediator tarafından gerçekleşeceği için bir örneğini tutar.
// Mesaj alma ve mesaj gönderme özellikleri içermektedir.
// UML diyagramındaki Colleague yapısına denk gelir.
abstract class User {
    public int id;
    public String name;

    private IChatRoomMediator _chatRoomMediator;

    public User(IChatRoomMediator chatRoomMediator) {
        _chatRoomMediator = chatRoomMediator;
    }

    public void receiveMessage(String message) {
        String result = String.format("%s received new message. Message: %s", name, message);
        System.out.println(result);
    }

    public void sendMessage(String message, int userId) {
        String result = String.format("%s send new message to: %d id user.", name, userId);
        System.out.println(result);

        _chatRoomMediator.sendMessage(message, userId);
    }
}
