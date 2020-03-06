using System;
using System.Collections.Generic;
using System.Text;

namespace AbstractFactory
{
    // Oracle için ilişkili nesneler üretildi.
    class OracleDatabaseFactory : IDatabaseFactory
    {
        public Command CreateCommand()
        {
            return new OracleCommand();
        }
        public Connection CreateConnection()
        {
            return new OracleConnection();
        }
    }
}
