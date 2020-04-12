package Bridge;

public class App {
    public static void main(String[] args) {
        IMessageSender textMessageSender = new TextMessageSender();
        Message textMessage = new TextMessage(textMessageSender);
        textMessage.send(); // output: TextMessageSender: Sending text message...

        IMessageSender emailMessageSender = new EmailMessageSender();
        Message emailMessage = new TextMessage(emailMessageSender);
        emailMessage.send(); // output: EmailMessageSender: Sending email message...
    }
}
