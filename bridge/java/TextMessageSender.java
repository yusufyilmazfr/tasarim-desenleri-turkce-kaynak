package Bridge;

// UML diyagramındaki ConcreteImplementor (TextMessageSender) kısmına denk gelmektedir.
// Implementor arayüzünü (IMessageSender) uygular.
public class TextMessageSender implements IMessageSender {
    @Override
    public void sendMessage(Message message) {
        System.out.println("TextMessageSender: Sending text message...");
    }
}
