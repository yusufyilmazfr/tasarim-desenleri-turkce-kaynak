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
		if instance == nil {
			instance = &database{}
		}
	}
	return instance
}
