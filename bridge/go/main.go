package main

func main() {
	textMsgSender := NewTextMessageSender()
	textMsg := NewTextMessage(textMsgSender)
	textMsg.Send()

	emailMsgSender := NewEmailMessageSender()
	emailMsg := NewEmailMessage(emailMsgSender)
	emailMsg.Send()
}
