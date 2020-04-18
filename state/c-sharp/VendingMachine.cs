using System;
using System.Collections.Generic;
using System.Text;

namespace State
{
    // Durumu izlenecek olan sınıftır.
    // UML diyagramındaki Context yapısına denk gelmektedir.
    public class VendingMachine
    {
        private VendingMachineState _state;

        // Otomata örneği oluştuğu zaman başlangıç durumuna geçiyor.
        public VendingMachine()
        {
            SetState(new InitializeState());
        }

        public void SetState(VendingMachineState state)
        {
            _state = state;
            _state.HandleState(this);
        }

        public void RequestProduct(string productName, double price)
        {
            // Burada ürünlere ait iş kodları olacaktır.
            // Ürün kontrolü, fiyatlandırma gibi kontroller.
            // Ürün ve fiyat olarak bir problemin olmadığı var sayılsın.

            SetState(new PreparingState());
        }
    }
}
