package main

import (
	"log"
)

func main() {
	smsNotify, _ := createNotify("SMS", Notify{Content: "Awesome SMS content"})
	mailNotify, _ := createNotify("MAIL", Notify{Content: "Awesome MAIL content"})
	_, err := createNotify("wrong", Notify{Content: "to intifity"})

	smsNotify.SendNotification(User{name: "sms lover"})
	mailNotify.SendNotification(User{name: "mail lover"})

	if err != nil {
		log.Fatal(err)
	}
}
