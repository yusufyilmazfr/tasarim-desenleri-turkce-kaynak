package main

import (
	"log"
)

func main() {
	smsNotify, _ := CreateNotify("SMS", Notify{Content: "Awesome SMS content"})
	mailNotify, _ := CreateNotify("MAIL", Notify{Content: "Awesome MAIL content"})
	_, err := CreateNotify("wrong", Notify{Content: "to intifity"})

	smsNotify.SendNotification(User{Name: "sms lover"})
	mailNotify.SendNotification(User{Name: "mail lover"})

	if err != nil {
		log.Fatal(err)
	}
}
