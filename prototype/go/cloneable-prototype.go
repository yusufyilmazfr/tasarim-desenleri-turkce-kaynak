package main

// Klonlamak istediğimiz sınıflarımıza uygulayacağımız arayüz.
type CloneablePrototype interface {
	clone() CloneablePrototype
}
