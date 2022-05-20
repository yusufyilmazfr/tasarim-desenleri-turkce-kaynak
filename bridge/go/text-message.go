package main

type TextMessage struct {
	messageSender MessageSender
}

func NewTextMessage(messageSender MessageSender) *TextMessage {
	return &TextMessage{
		messageSender: messageSender,
	}
}

func (m *TextMessage) Send() {
	m.messageSender.sendMessage(m)
}
