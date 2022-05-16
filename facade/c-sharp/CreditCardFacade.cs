using System;
using System.Collections.Generic;
using System.Text;

namespace Facade
{
    class CreditCardFacade
    {
        public void CreateCreditCart(Customer customer)
        {
            CreditCardManager creditCardManager = new CreditCardManager(); ;
            BlackListService blackListService = new BlackListService();

            if (!blackListService.CheckEmployeeIsTheBlackList(customer))
            {
                creditCardManager.CreateCreditCart(customer);
            }
        }
    }
}
