using System;
using System.Collections.Generic;
using System.Text;

namespace AbstractFactory
{
    class OracleConnection : Connection
    {
        public override bool OpenConnection()
        {
            // Oracle veri tabanı bağlantısının açılması için
            // Gerekli operasyonel işlemler...
            return true;
        }
        public override bool CloseConnection()
        {
            // Oracle veri tabanı bağlantısının kapatılması için
            // Gerekli operasyonel işlemler...
            return true;
        }
    }
}
