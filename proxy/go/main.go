package main

func main() {
	semanur := NewPerson("11111111111", "İstanbul/Sancaktepe xxx-yyy-zzz")

	orderableMask := NewAuthenticatableMaskOrderProxy()

	orderableMask.CreateOrder(semanur)
	// output: Order created to İstanbul/Sancaktepe xxx-yyy-zzz
}
