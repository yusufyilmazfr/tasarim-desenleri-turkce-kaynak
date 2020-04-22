using System;
using System.Collections.Generic;
using System.Text;

namespace Iterator
{
    // Liste üzerinde gezilecek olan elamnı temsil eden sınıf.
    class Employee
    {
        public int id;
        public string firstName;
        public string lastName;

        public Employee(int id, string firstName, string lastName)
        {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }
}
