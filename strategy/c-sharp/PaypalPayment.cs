using System;
using System.Collections.Generic;
using System.Text;

namespace Strategy
{
    // UMl diyagramındaki ConcreteStrategy sınıfına denk gelmektedir.
    // UML diyagramındaki Strategy arayüzüne denk gelen arayüzü uyguluyor.
    class PaypalPayment : IPayment
    {
        private string _email;
        private string _password;

        public PaypalPayment(string email, string password)
        {
            _email = email;
            _password = password;
        }

        public void Pay(int amount)
        {
            // Kredi kartı ödeme işlemlerinin gerçekleştiği yer.
            Console.WriteLine("Paid by Paypal.");
        }
    }
}
