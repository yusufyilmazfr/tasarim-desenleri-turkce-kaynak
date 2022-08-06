package main

import "fmt"

type oracleCommand struct{}

func newOracleCommand() *oracleCommand {
	return &oracleCommand{}
}

func (c *oracleCommand) executeCommand(query string) {
	// Gelen sorgunun çalıştırılması için
	// Gerekli operasyonel işlemler...
	fmt.Println("Oracle Command Executed")
}
