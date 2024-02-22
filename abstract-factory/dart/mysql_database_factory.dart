import 'command.dart';
import 'connection.dart';
import 'i_database_factory.dart';
import 'mysql_command.dart';
import 'mysql_connection.dart';

final class MysqlDatabaseFactory implements IDatabaseFactory {
  const MysqlDatabaseFactory();

  @override
  Command createCommand() {
    return const MysqlCommand();
  }

  @override
  Connection createConnection() {
    return const MysqlConnection();
  }
}
