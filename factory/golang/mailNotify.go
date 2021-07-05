package main

import "fmt"

type MailNotify struct {
	Notify
}

func (n *MailNotify) SendNotification(user User) {
	fmt.Printf("(mail)sent a notification '%v' to: %v\n", n.Content, user.Name)
}
