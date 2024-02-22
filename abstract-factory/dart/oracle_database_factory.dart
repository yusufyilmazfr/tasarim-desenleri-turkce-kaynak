import 'command.dart';
import 'connection.dart';
import 'i_database_factory.dart';
import 'oracle_command.dart';
import 'oracle_connection.dart';

final class OracleDatabaseFactory implements IDatabaseFactory {
  const OracleDatabaseFactory();

  @override
  Command createCommand() {
    return const OracleCommand();
  }

  @override
  Connection createConnection() {
    return const OracleConnection();
  }
}
