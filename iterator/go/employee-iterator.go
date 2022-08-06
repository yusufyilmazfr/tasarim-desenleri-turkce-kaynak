package main

// Iterator arayüzünü ve koleksiyon üzerinde dolaşmak için gerekli metotları uygular.
// Veriler üzerinde dolanma işlemleri burada gerçekleştirilecektir.
// ConcreteAggregate (EmployeeListAggregate) sınıfı ile birlikte çalışır
type employeeIterator struct {
	employeeListAggregate *employeeListAggregate
	currentIndex          int
}

func NewEmployeeIterator(employeeListAggregate *employeeListAggregate) *employeeIterator {
	return &employeeIterator{
		employeeListAggregate: employeeListAggregate,
		currentIndex:          0,
	}
}

func (e *employeeIterator) GetCurrentItem() *Employee {
	e.currentIndex++
	return e.employeeListAggregate.employees[e.currentIndex-1]
}

func (e employeeIterator) HasNext() bool {
	if e.currentIndex < e.employeeListAggregate.Count() {
		return true
	}
	return false
}
