using System;
using System.Collections.Generic;
using System.Text;

namespace Proxy
{
    // Maske siparişini verecek kullanıcıları temsili sınıf.
    class Person
    {
        public string TC { get; set; }
        public string Address { get; set; }

        public Person(string tc, string address)
        {
            TC = tc;
            Address = address;
        }
    }
}
