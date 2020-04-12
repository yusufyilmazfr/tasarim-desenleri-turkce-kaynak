package Bridge

// UML diyagramındaki ConcreteImplementor (EmailMessageSender) kısmına denk gelmektedir.
// Implementor arayüzünü (IMessageSender) uygular.
class EmailMessageSender : IMessageSender {
    override fun sendMessage(message: Message) {
        println("EmailMessageSender: Sending email message...")
    }
}
