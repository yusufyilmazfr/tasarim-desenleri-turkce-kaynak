using System;
using System.Collections.Generic;
using System.Text;

namespace Iterator
{
    // Iterator arayüzünü uygulayan sınıf örneklerini elde etmek için metot içerir.
    // Bu sayede çeşitli Iterator arayüzünü uygulayan sınıfların örneklerini elde edebiliriz.
    // UML diyagramındaki Aggregate arayüzüne denk gelmektedir.
    interface IEmployeeAggregate
    {
        IIterator<Employee> CreateIterator();
    }
}
