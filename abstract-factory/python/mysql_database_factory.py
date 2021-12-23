from database_factory import DatabaseFactory
from mysql_connection import MysqlConnection
from mysql_command import MysqlCommand


class MysqlDatabaseFactory(DatabaseFactory):
    def create_command(self):
        return MysqlCommand()

    def create_connection(self):
        return MysqlConnection()
