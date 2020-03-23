using System;
using System.Collections.Generic;
using System.Text;

namespace Strategy
{
    // Sepette bulunan ürünleri temsil eden sınıf.
    // Ürün kodu ve fiyat bilgileri temel olarak yeterlidir.
    class Item
    {
        private string _upcCode;
        private int _price;

        public Item(string upcCode, int price)
        {
            _upcCode = upcCode;
            _price = price;
        }

        public int GetPrice()
        {
            return _price;
        }
    }
}
