<?php

namespace AbstractFactory;

use AbstractFactory\IDatabaseFactory;
use AbstractFactory\Connection;
use AbstractFactory\Command;
use AbstractFactory\OracleConnection;
use AbstractFactory\OracleCommand;

class OracleDatabaseFactory implements IDatabaseFactory
{
    function createConnection(): Connection
    {
        return new OracleConnection();
    }

    function createCommand(): Command
    {
        return new OracleCommand();
    }
}
