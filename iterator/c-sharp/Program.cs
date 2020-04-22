using System;
using System.Collections.Generic;

namespace Iterator
{
    class Program
    {
        static void Main(string[] args)
        {
            EmployeeListAggregate employeeListAggregate = new EmployeeListAggregate();

            Employee yusuf = new Employee(1, "Yusuf", "Yılmaz");
            Employee arafat = new Employee(2, "Arafat", "Önlük");
            Employee derya = new Employee(3, "Derya", "Obi");

            employeeListAggregate.Add(yusuf);
            employeeListAggregate.Add(arafat);
            employeeListAggregate.Add(derya);

            var iterator = employeeListAggregate.CreateIterator();

            while (iterator.HasNext())
            {
                Employee currentEmployee = iterator.GetCurrentItem();
                Console.WriteLine($"{currentEmployee.firstName} {currentEmployee.lastName}");
            }

            // output:
            //  Yusuf Yılmaz
            //  Arafat Önlük
            //  Derya Obi
        }
    }
}
