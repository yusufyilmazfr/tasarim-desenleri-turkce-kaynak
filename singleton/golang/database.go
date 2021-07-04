package main

import (
	"sync"
)

type database struct {
}

var (
	lock     = &sync.Mutex{}
	instance *database
)

func GetInstance() *database {
	if instance == nil {
		lock.Lock()
		defer lock.Unlock()
		instance = &database{}
	}
	return instance
}
