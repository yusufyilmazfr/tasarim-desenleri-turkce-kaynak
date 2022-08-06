package main

type Connection interface {
	openConnection() error
	closeConnection() error
}
