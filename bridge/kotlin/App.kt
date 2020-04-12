package Bridge

fun main(args: Array<String>) {
    val textMessageSender = TextMessageSender()
    val textMessage = TextMessage(textMessageSender)
    textMessage.send() // output: TextMessageSender: Sending text message...

    val emailMessageSender = EmailMessageSender()
    val emailMessage = TextMessage(emailMessageSender)
    emailMessage.send() // output: EmailMessageSender: Sending email message...
}
