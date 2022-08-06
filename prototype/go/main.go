package main

import "fmt"

func main() {
	gulizar := NewEmployee("Gülizar", "Yılmaz")
	cloneGulizar := gulizar.clone()

	// Aynı nesne örneklerini farklı referanslarda tutuyor.
	// Birbirinin aynısı ve farklı referanslarda olan nesneler elde ettik.
	fmt.Printf("Gulizar: %+v\n", gulizar)
	fmt.Printf("Clone Gulizar: %+v\n", cloneGulizar)
	fmt.Println(gulizar == cloneGulizar)
}
