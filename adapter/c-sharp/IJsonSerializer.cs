using System;
using System.Collections.Generic;
using System.Text;

namespace Adapter
{
    // UML diyagramındaki Target'a denk gelmektedir.
    // Sistem bu arayüzü uygulayarak çalışmaktadır.
    interface IJsonSerializer
    {
        public string SerializeObject(object obj);
    }
}
