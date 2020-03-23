using System;
using System.Collections.Generic;
using System.Text;

namespace Strategy
{
    // UMl diyagramındaki ConcreteStrategy sınıfına denk gelmektedir.
    // UML diyagramındaki Strategy arayüzüne denk gelen arayüzü uyguluyor.
    class CreditCartPayment : IPayment
    {
        private string _name;
        private string _cardNumber;
        private string _cvv;
        private string _dateOfExpiry;

        public CreditCartPayment(string name, string ccNum, string cvv, string expiryDate)
        {
            _name = name;
            _cardNumber = ccNum;
            _cvv = cvv;
            _dateOfExpiry = expiryDate;
        }

        public void Pay(int amount)
        {
            // Kredi kartı ödeme işlemlerinin gerçekleştiği yer.
            Console.WriteLine("Paid by credit cart.");
        }
    }
}
