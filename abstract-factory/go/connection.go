package main

type connection interface {
	openConnection() error
	closeConnection() error
}
