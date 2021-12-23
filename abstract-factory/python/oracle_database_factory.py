from database_factory import DatabaseFactory
from oracle_command import OracleCommand
from oracle_connection import OracleConnection


class OracleDatabaseFactory(DatabaseFactory):
    def create_command(self):
        return OracleCommand()

    def create_connection(self):
        return OracleConnection()
