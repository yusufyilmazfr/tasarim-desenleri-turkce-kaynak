package main

import (
	"fmt"
)

func main() {
	firstInstance := GetInstance()
	secondInstance := GetInstance()

	isEqual := firstInstance == secondInstance
	fmt.Printf("Database referance is equals: %v\n", isEqual)
}
