# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 16.12.2021
from connection import Connection


class OracleConnection(Connection):
    def open_connection(self):
        return True

    def close_connection(self):
        return True
