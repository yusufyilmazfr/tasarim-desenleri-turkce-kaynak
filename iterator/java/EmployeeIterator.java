package Iterator;

// Iterator arayüzünü ve koleksiyon üzerinde dolaşmak için gerekli metotları uygular.
// Veriler üzerinde dolanma işlemleri burada gerçekleştirilecektir.
// ConcreteAggregate (EmployeeListAggregate) sınıfı ile birlikte çalışır
class EmployeeIterator implements IIterator<Employee> {
    private EmployeeListAggregate _employeeListAggregate;
    private int _currentIndex;

    public EmployeeIterator(EmployeeListAggregate employeeListAggregate) {
        _employeeListAggregate = employeeListAggregate;
        _currentIndex = 0;
    }

    public Employee getCurrentItem() {
        return _employeeListAggregate.get(_currentIndex++);
    }

    public Boolean hasNext() {
        if (_employeeListAggregate.count() > _currentIndex) {
            return true;
        }
        return false;
    }
}
