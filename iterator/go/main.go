package main

import "fmt"

func main() {
	empListAggregate := NewEmployeeListAggregate()

	yusuf := NewEmployee(1, "Yusuf", "Yilmaz")
	arafat := NewEmployee(2, "Arafat", "Onluk")
	derya := NewEmployee(3, "Derya", "Obi")

	empListAggregate.Add(yusuf)
	empListAggregate.Add(arafat)
	empListAggregate.Add(derya)

	iterator := empListAggregate.CreateIterator()

	for iterator.HasNext() {
		currentEmployee := iterator.GetCurrentItem()
		fmt.Printf("%s %s\n", currentEmployee.FirstName, currentEmployee.LastName)
	}

	// output:
	//  Yusuf Yilmaz
	//  Arafat Onluk
	//  Derya Obi
}
