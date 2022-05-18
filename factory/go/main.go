package main

func main() {
	notifyFactory := newNotifyFactory()
	notify := notifyFactory.createNotify("MAIL")
	notify2 := notifyFactory.createNotify("SMS")

	notify.sendNotification(newUser("Test"))
	notify2.sendNotification(newUser("Test"))
}
