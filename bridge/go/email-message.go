package main

type emailMessage struct {
	messageSender MessageSender
}

func NewEmailMessage(messageSender MessageSender) *emailMessage {
	return &emailMessage{
		messageSender: messageSender,
	}
}

func (m *emailMessage) Send() {
	m.messageSender.sendMessage(m)
}
