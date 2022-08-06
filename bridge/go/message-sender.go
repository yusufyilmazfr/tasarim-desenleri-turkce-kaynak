package main

type MessageSender interface {
	sendMessage(message Message)
}
