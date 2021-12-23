from database_factory import DatabaseFactory
from connection import Connection
from command import Command


class CustomOperation:
    _database_factory: DatabaseFactory
    _connection: Connection
    _command: Command

    def __init__(self, database_factory):
        self._database_factory = database_factory
        self._connection = database_factory.create_connection()
        self._command = database_factory.create_command()

    def remove_by_id(self, r_id):
        self._connection.open_connection()
        self._command.execute_command("DELETE...")
        print(f"Removed id: {r_id} from  {self._database_factory}")
        self._connection.close_connection()
