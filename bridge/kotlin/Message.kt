package Bridge

abstract class Message(protected var messageSender: IMessageSender) {
    abstract fun send()
}
