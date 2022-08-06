package main

import "fmt"

type SMSNotify struct {
}

func newSMSNotify() *SMSNotify {
	return &SMSNotify{}
}

func (s *SMSNotify) sendNotification(user User) {
	fmt.Printf("Sending sms notification to %s\n", user.name)
}
