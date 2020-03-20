using System;
using System.Collections.Generic;
using System.Text;

namespace Prototype
{
    // Employee sınıfına klonlama yeteneği kazandırmak için tanımladığımız arayüzü uyguladık.
    class Employee : IClonablePrototype<Employee>
    {
        string firstName;
        string lastName;

        public Employee(string firstName, string lastName)
        {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Employee Clone()
        {
            return base.MemberwiseClone() as Employee;
        }
    }
}
