package main

import (
	"sync"
)

var lock = &sync.Mutex{}

var Database *database

type database struct {
}

func (d *database) getInstance() *database {
	if Database == nil {
		lock.Lock()
		defer lock.Unlock()
		if Database == nil {
			Database = &database{}
		}
	}

	return Database
}
