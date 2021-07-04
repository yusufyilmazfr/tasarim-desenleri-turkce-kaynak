package main

import "fmt"

type SmsNotify struct {
	Notify
}

func (n *SmsNotify) SendNotification(user User) {
	fmt.Printf("(sms)sent a notification '%v' to: %v\n", n.Content, user.name)
}
