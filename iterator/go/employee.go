package main

// Employee Liste uzerinde gezilecek olan elemani temsil eden sinif.
type Employee struct {
	ID        int
	FirstName string
	LastName  string
}

func NewEmployee(id int, firstName string, lastName string) *Employee {
	return &Employee{
		ID:        id,
		FirstName: firstName,
		LastName:  lastName,
	}
}
