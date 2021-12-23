from employee_aggregate import EmployeeAggregate
from employee_iterator import EmployeeIterator
from employee import Employee


class EmployeListAggregate(EmployeeAggregate):
    """
    Aggregate (IEmployeeAggregate) arayüzünü uygular ve Iterator arayüzünü uygulayan sınıf örneği üretir.
    Değerlerin referansları burada bulunur.
    UML diyagramındaki ConcreteAggregate  sınıfına denk gelmektedir.
    """

    def __init__(self):
        self._employees = []

    def add(self, employee: Employee):
        self._employees.append(employee)

    def count(self):
        return len(self._employees)

    def get(self, index: int):
        return self._employees[index]

    def create_iterator(self):
        return EmployeeIterator(self)
