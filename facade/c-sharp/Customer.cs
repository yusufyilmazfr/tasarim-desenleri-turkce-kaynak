using System;
using System.Collections.Generic;
using System.Text;

namespace Facade
{
    // Banka müşterimizi temsili oluşturan sınıf.
    class Customer
    {
        public Customer(string firstName, string lastName)
        {
            FirstName = firstName;
            LastName = lastName;
        }

        public string FirstName { get; set; }
        public string LastName { get; set; }
    }
}
