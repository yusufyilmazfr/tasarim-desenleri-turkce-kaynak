package main

type iNotify interface {
	SendNotification(user User)
}
