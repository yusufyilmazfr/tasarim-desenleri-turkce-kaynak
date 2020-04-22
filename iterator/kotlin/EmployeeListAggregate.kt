package Iterator

import java.util.ArrayList

// Aggregate (IEmployeeAggregate) arayüzünü uygular ve Iterator arayüzünü uygulayan sınıf örneği üretir.
// Değerlerin referansları burada bulunur.
// UML diyagramındaki ConcreteAggregate  sınıfına denk gelmektedir.
internal class EmployeeListAggregate : IEmployeeAggregate {
    private val _employees: MutableList<Employee>

    init {
        _employees = ArrayList()
    }

    fun add(employee: Employee) {
        _employees.add(employee)
    }

    fun count(): Int {
        return _employees.size
    }

    operator fun get(index: Int): Employee {
        return _employees[index]
    }

    override fun createIterator(): IIterator<Employee> {
        return EmployeeIterator(this)
    }
}