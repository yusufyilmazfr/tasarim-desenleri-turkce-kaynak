using System;
using System.Collections.Generic;
using System.Text;

namespace AbstractFactory
{
    class MySQLCommand : Command
    {
        public override void ExecuteCommand(string query)
        {
            // Gelen sorgunun çalıştırılması için
            // Gerekli operasyonel işlemler...
        }
    }
}
