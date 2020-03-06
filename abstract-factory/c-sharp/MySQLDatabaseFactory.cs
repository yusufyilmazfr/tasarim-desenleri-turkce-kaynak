using System;
using System.Collections.Generic;
using System.Text;

namespace AbstractFactory
{
    // MySQL için ilişkili nesneler üretildi.
    class MySQLDatabaseFactory : IDatabaseFactory
    {
        public Command CreateCommand()
        {
            return new MySQLCommand();
        }

        public Connection CreateConnection()
        {
            return new MySQLConnection();
        }
    }
}
