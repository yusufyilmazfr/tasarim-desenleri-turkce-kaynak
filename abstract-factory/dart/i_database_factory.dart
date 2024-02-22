import 'command.dart';
import 'connection.dart';

abstract class IDatabaseFactory {
  Connection createConnection();
  Command createCommand();
}
