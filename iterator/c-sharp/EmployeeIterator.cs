using System;
using System.Collections.Generic;
using System.Text;

namespace Iterator
{
    // Iterator arayüzünü ve koleksiyon üzerinde dolaşmak için gerekli metotları uygular.
    // Veriler üzerinde dolanma işlemleri burada gerçekleştirilecektir.
    // ConcreteAggregate (EmployeeListAggregate) sınıfı ile birlikte çalışır
    class EmployeeIterator : IIterator<Employee>
    {
        private EmployeeListAggregate _employeeListAggregate;
        private int _currentIndex;

        public EmployeeIterator(EmployeeListAggregate employeeListAggregate)
        {
            _employeeListAggregate = employeeListAggregate;
            _currentIndex = 0;
        }

        public Employee GetCurrentItem()
        {
            return _employeeListAggregate.Get(_currentIndex++);
        }

        public bool HasNext()
        {
            if (_employeeListAggregate.Count() > _currentIndex)
            {
                return true;
            }
            return false;
        }
    }
}
