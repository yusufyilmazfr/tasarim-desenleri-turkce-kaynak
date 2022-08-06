package main

// JSONSerializer interface UML diyagramındaki Target'a denk gelmektedir.
// Sistem bu arayüzü uygulayarak çalışmaktadır.
type JSONSerializer interface {
	serializeObject(object []byte) string
}
