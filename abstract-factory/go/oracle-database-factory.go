package main

// Oracle için ilişkili nesneler üretildi.
type oracleDatabaseFactory struct{}

func NewOracleDatabaseFactory() *oracleDatabaseFactory {
	return &oracleDatabaseFactory{}
}

func (f *oracleDatabaseFactory) createConnection() Connection {
	return newOracleConnection()
}

func (f *oracleDatabaseFactory) createCommand() Command {
	return newOracleCommand()
}
