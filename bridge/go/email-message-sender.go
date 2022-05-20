package main

import "fmt"

type EmailMessageSender struct{}

func NewEmailMessageSender() *EmailMessageSender {
	return &EmailMessageSender{}
}

func (s *EmailMessageSender) sendMessage(message Message) {
	fmt.Println("EmailMessageSender: Sending email message...")
}
