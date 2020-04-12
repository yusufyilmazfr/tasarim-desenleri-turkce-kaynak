package Bridge

// UML diyagramındaki ConcreteImplementor (TextMessageSender) kısmına denk gelmektedir.
// Implementor arayüzünü (IMessageSender) uygular.
class TextMessageSender : IMessageSender {
    override fun sendMessage(message: Message) {
        println("TextMessageSender: Sending text message...")
    }
}
