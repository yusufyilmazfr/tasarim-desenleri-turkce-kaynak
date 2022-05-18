package main

// Klonlamak istediğimiz sınıflarımıza uygulayacağımız arayüz.
type cloneablePrototype interface {
	clone() cloneablePrototype
}
