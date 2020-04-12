package Bridge

// UML diyagramındaki Implementor (IMessageSender) arayüzünen denk gelmektedir.
// Abstraction (Message) tarafından referansı tutulur ve haberleşme burası ile gerçekleşir.
interface IMessageSender {
    fun sendMessage(message: Message)
}
