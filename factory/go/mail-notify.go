package main

import "fmt"

type MailNotify struct {
}

func newMailNotify() *MailNotify {
	return &MailNotify{}
}

func (m *MailNotify) sendNotification(user User) {
	fmt.Printf("Sending mail notification to %s\n", user.name)
}
