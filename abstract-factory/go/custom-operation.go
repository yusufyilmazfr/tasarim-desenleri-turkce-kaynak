package main

import (
	"fmt"
)

type customOperation struct {
	databaseFactory databaseFactory
	connection      connection
	command         command
}

func NewCustomOperation(databaseFactory databaseFactory) *customOperation {
	return &customOperation{
		databaseFactory: databaseFactory,
		command:         databaseFactory.createCommand(),
		connection:      databaseFactory.createConnection(),
	}
}

func (c *customOperation) removeById(id int) error {
	if err := c.connection.openConnection(); err != nil {
		return fmt.Errorf("error opening connection: %v", err)
	}
	c.command.executeCommand("Delete ...")
	if err := c.connection.closeConnection(); err != nil {
		return fmt.Errorf("error closing connection: %v", err)
	}
	return nil
}
