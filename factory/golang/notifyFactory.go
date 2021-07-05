package main

import "fmt"

func newSmsNotify(n Notify) iNotify {
	return &SmsNotify{Notify: n}
}

func newMailNotify(n Notify) iNotify {
	return &MailNotify{Notify: n}
}

func CreateNotify(notifyType string, n Notify) (iNotify, error) {
	if notifyType == "SMS" {
		return newSmsNotify(n), nil
	} else if notifyType == "MAIL" {
		return newMailNotify(n), nil
	}
	return nil, fmt.Errorf("wrong type")
}
