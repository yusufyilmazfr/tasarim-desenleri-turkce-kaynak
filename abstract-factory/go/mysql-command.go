package main

import "fmt"

type mysqlCommand struct{}

func newMySQLCommand() *mysqlCommand {
	return &mysqlCommand{}
}

func (c *mysqlCommand) executeCommand(query string) {
	// Gelen sorgunun çalıştırılması için
	// Gerekli operasyonel işlemler...
	fmt.Println("MySQL Command Executed")
}
