<?php

namespace AbstractFactory;

use AbstractFactory\IDatabaseFactory;

class CustomOperation
{
    public $_databaseFactory;
    public $_connection;
    public $_command;

    public function __construct(IDatabaseFactory $databaseFactory)
    {
        $this->_databaseFactory = $databaseFactory;
        $this->_connection = $databaseFactory->createConnection();
        $this->_command = $databaseFactory->createCommand();
    }

    public function removeById(int $id)
    {
        $this->_connection->openConnection();
        $this->_command->executeCommand("DELETE ...");
        $this->_connection->closeConnection();
    }
}
