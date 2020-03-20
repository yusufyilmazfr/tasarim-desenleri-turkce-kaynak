using System;
using System.Collections.Generic;
using System.Text;

namespace Adapter
{
    // Sisteme daha sonradan dahil olan yapı.
    // Sistemin kullandığı arayüzü uygulamamaktadır.
    class CustomSerializer
    {
        public string Serialize(object obj)
        {
            // Gelen nesneyi serilize etmek için temel operasyonel işlemler..
            // Daha sonradan da gerekli değerin geri döndürülmesi...
            return "serialized with CustomSerializer";
        }
    }
}
