package main

type User struct {
	// Burada bildirimin gideceği kullanıcıya
	// ait bilgiler bulunacaktır.
	name string
}

func newUser(name string) User {
	return User{name: name}
}
