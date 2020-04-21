using System;
using System.Collections.Generic;
using System.Text;

namespace Observer
{
    // Bildirilecek olan nesnelere paremetre olarak giden mesaj.
    // UML diyagramı ile ilgisi yoktur.
    class ProductUpdateMessage
    {
        public string productName;
        public string message;

        public override string ToString()
        {
            return $"{productName} updated. Message: {message}";
        }
    }
}
