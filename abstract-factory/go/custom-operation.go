package main

import (
	"fmt"
)

type customOperation struct {
	databaseFactory DatabaseFactory
	connection      Connection
	command         Command
}

func NewCustomOperation(databaseFactory DatabaseFactory) *customOperation {
	return &customOperation{
		databaseFactory: databaseFactory,
		command:         databaseFactory.createCommand(),
		connection:      databaseFactory.createConnection(),
	}
}

func (c *customOperation) removeById(id int) error {
	if err := c.connection.openConnection(); err != nil {
		return fmt.Errorf("error opening Connection: %v", err)
	}
	c.command.executeCommand("Delete ...")
	if err := c.connection.closeConnection(); err != nil {
		return fmt.Errorf("error closing Connection: %v", err)
	}
	return nil
}
