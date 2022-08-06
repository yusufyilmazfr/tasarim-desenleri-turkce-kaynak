package main

import "fmt"

func main() {
	firstInstanceRequest := Database.getInstance()
	secondInstanceRequest := Database.getInstance()

	isEquals := firstInstanceRequest == secondInstanceRequest

	fmt.Printf("Database referance is equals: %v", isEquals) //output: Database reference is equals: true
}
