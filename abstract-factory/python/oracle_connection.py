from connection import Connection


class OracleConnection(Connection):
    def open_connection(self):
        return True

    def close_connection(self):
        return True
