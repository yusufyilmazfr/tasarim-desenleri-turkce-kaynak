# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 16.12.2021
from custom_operation import CustomOperation
from oracle_database_factory import OracleDatabaseFactory
from mysql_database_factory import MysqlDatabaseFactory

if __name__ == '__main__':
    custom_operation = CustomOperation(OracleDatabaseFactory())
    custom_operation.remove_by_id(1)

    custom_operation = CustomOperation(MysqlDatabaseFactory())
    custom_operation.remove_by_id(1)
