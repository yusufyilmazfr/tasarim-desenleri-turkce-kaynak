<?php

namespace AbstractFactory;

use AbstractFactory\IDatabaseFactory;
use AbstractFactory\Connection;
use AbstractFactory\Command;
use AbstractFactory\MySQLConnection;
use AbstractFactory\MySQLCommand;

class MySQLDatabaseFactory implements IDatabaseFactory
{
    function createConnection(): Connection
    {
        return new MySQLConnection();
    }

    function createCommand(): Command
    {
        return new MySQLCommand();
    }
}
