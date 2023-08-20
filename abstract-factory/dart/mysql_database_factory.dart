import 'command.dart';
import 'connection.dart';
import 'i_database_factory.dart';
import 'mysql_command.dart';
import 'mysql_connection.dart';

// MySQL için ilişkili nesneler üretildi.
final class MysqlDatabaseFactory implements IDatabaseFactory {
  const MysqlDatabaseFactory();

  @override
  Command createCommand() {
    return MysqlCommand();
  }

  @override
  Connection createConnection() {
    return MysqlConnection();
  }
}
