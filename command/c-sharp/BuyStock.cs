using System;
using System.Collections.Generic;
using System.Text;

namespace Command
{
    // Nesnelere dönüştürdüğümüz her bir isteğe denk gelmektedir.
    // Command (IOrderCommand) arayüzünü uygular.
    // UML diyagramındaki ConcreteCommand sınıfına denk gelmektedir.
    class BuyStock : IOrderCommand
    {
        private StockManager _stockManager;

        public BuyStock(StockManager stockManager)
        {
            _stockManager = stockManager;
        }

        public void Execute()
        {
            _stockManager.Buy();
        }
    }
}
