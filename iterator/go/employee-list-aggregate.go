package main

// Aggregate (IEmployeeAggregate) arayüzünü uygular ve Iterator arayüzünü uygulayan sınıf örneği üretir.
// Değerlerin referansları burada bulunur.
// UML diyagramındaki ConcreteAggregate  sınıfına denk gelmektedir.
type employeeListAggregate struct {
	employees []*Employee
}

func NewEmployeeListAggregate() *employeeListAggregate {
	return &employeeListAggregate{
		employees: make([]*Employee, 0),
	}
}

func (e *employeeListAggregate) Add(employee *Employee) {
	e.employees = append(e.employees, employee)
}

func (e *employeeListAggregate) Count() int {
	return len(e.employees)
}

func (e *employeeListAggregate) CreateIterator() Iterator {
	return NewEmployeeIterator(e)
}
