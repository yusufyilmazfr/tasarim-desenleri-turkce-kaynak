package Bridge

// UML diyagramındaki RefinedAbstraction kısmına denk gelmektedir.
// Abstraction (Message) sınıfından türer.
class EmailMessage(messageSender: IMessageSender) : Message(messageSender) {
    override fun send() {
        messageSender.sendMessage(this)
    }
}
