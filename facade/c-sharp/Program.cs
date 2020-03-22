using System;

namespace Facade
{
    class Program
    {
        static void Main(string[] args)
        {
            Customer duygu = new Customer("Duygu", "Kaya");

            CreditCardFacade creditCardFacade = new CreditCardFacade();
            creditCardFacade.CreateCreditCart(duygu);
        }
    }
}
