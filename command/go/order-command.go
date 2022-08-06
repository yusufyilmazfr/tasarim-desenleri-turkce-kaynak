package main

// OrderCommand temel arayüzdür.
// Komutların çalıştırılması için temel metotu içermektedir.
// UML diyagramındaki Command arayüzüne denk gelmektedir.
type OrderCommand interface {
	Execute()
}
