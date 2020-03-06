using System;
using System.Collections.Generic;
using System.Text;

namespace AbstractFactory
{
    // Oluşturulacak ürünlere ait metotları içerir.
    // Oracle ve MySQL için bunların geriye döndüreceği
    // Nesneler farklı olacaktır.
    interface IDatabaseFactory
    {
        Connection CreateConnection();
        Command CreateCommand();
    }
}
