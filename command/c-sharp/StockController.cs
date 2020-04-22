using System;
using System.Collections.Generic;
using System.Text;

namespace Command
{
    // Command (IOrderCommand) arayüzünü uygulayan sınıf referansını tutar.
    // Metotun ne zaman çağrılacağını belirtir.
    // UML diyagramındaki Invoker sınıfına denk gelmektedir.
    class StockController
    {
        private List<IOrderCommand> _orderCommands;

        public StockController()
        {
            _orderCommands = new List<IOrderCommand>();
        }

        public void TakeOrder(IOrderCommand command)
        {
            _orderCommands.Add(command);
        }

        public void PlaceOrders()
        {
            foreach (IOrderCommand command in _orderCommands)
            {
                command.Execute();
            }

            _orderCommands.Clear();
        }
    }
}
