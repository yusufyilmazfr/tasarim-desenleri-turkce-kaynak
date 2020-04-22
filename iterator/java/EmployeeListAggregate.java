package Iterator;

import java.util.ArrayList;
import java.util.List;

// Aggregate (IEmployeeAggregate) arayüzünü uygular ve Iterator arayüzünü uygulayan sınıf örneği üretir.
// Değerlerin referansları burada bulunur.
// UML diyagramındaki ConcreteAggregate  sınıfına denk gelmektedir.
class EmployeeListAggregate implements IEmployeeAggregate {
    private List<Employee> _employees;

    public EmployeeListAggregate() {
        _employees = new ArrayList<>();
    }

    public void add(Employee employee) {
        _employees.add(employee);
    }

    public int count() {
        return _employees.size();
    }

    public Employee get(int index) {
        return _employees.get(index);
    }

    public IIterator<Employee> createIterator() {
        return new EmployeeIterator(this);
    }
}