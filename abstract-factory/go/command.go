package main

type Command interface {
	executeCommand(query string)
}
