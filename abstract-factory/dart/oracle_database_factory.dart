import 'command.dart';
import 'connection.dart';
import 'i_database_factory.dart';
import 'oracle_command.dart';
import 'oracle_connection.dart';

// Oracle için ilişkili nesneler üretildi.
final class OracleDatabaseFactory implements IDatabaseFactory {
  const OracleDatabaseFactory();

  @override
  Command createCommand() {
    return OracleCommand();
  }

  @override
  Connection createConnection() {
    return OracleConnection();
  }
}
