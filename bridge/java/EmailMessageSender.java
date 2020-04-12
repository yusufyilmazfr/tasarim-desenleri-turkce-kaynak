package Bridge;

// UML diyagramındaki ConcreteImplementor (EmailMessageSender) kısmına denk gelmektedir.
// Implementor arayüzünü (IMessageSender) uygular.
public class EmailMessageSender implements IMessageSender {
    @Override
    public void sendMessage(Message message) {
        System.out.println("EmailMessageSender: Sending email message...");
    }
}
