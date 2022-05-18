package main

// MySQL için ilişkili nesneler üretildi.
type mysqlDatabaseFactory struct{}

func NewMySQLDatabaseFactory() *mysqlDatabaseFactory {
	return &mysqlDatabaseFactory{}
}

func (f *mysqlDatabaseFactory) createConnection() connection {
	return newMySQLConnection()
}

func (f *mysqlDatabaseFactory) createCommand() command {
	return newMySQLCommand()
}
