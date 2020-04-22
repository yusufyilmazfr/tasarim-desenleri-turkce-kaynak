package Iterator

// Iterator arayüzünü ve koleksiyon üzerinde dolaşmak için gerekli metotları uygular.
// Veriler üzerinde dolanma işlemleri burada gerçekleştirilecektir.
// ConcreteAggregate (EmployeeListAggregate) sınıfı ile birlikte çalışır
internal class EmployeeIterator(private val _employeeListAggregate: EmployeeListAggregate) : IIterator<Employee> {
    private var _currentIndex: Int = 0

    override val currentItem: Employee
        get() = _employeeListAggregate.get(_currentIndex++)

    init {
        _currentIndex = 0
    }

    override fun hasNext(): Boolean? {
        return if (_employeeListAggregate.count() > _currentIndex) {
            true
        } else false
    }
}
