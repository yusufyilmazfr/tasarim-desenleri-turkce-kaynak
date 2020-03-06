using System;
using System.Collections.Generic;
using System.Text;

namespace AbstractFactory
{
    class CustomOperation
    {
        IDatabaseFactory _databaseFactory;
        Connection _connection;
        Command _command;

        public CustomOperation(IDatabaseFactory databaseFactory)
        {
            _databaseFactory = databaseFactory;
            _command = databaseFactory.CreateCommand();
            _connection = databaseFactory.CreateConnection();
        }

        public void RemoveById(int id)
        {
            _connection.OpenConnection();
            _command.ExecuteCommand("DELETE ...");
            _connection.CloseConnection();
        }
    }
}
