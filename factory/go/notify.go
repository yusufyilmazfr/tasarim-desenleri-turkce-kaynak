package main

type Notify interface {
	sendNotification(user User)
}
