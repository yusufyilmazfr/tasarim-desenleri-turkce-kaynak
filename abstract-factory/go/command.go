package main

type command interface {
	executeCommand(query string)
}
