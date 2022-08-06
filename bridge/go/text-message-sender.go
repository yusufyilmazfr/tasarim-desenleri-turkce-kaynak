package main

import "fmt"

type TextMessageSender struct{}

func NewTextMessageSender() *TextMessageSender {
	return &TextMessageSender{}
}

func (s *TextMessageSender) sendMessage(message Message) {
	fmt.Println("TextMessageSender: Sending text message...")
}
