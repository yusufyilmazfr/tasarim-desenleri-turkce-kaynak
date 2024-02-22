import 'command.dart';

final class OracleCommand implements Command {
  const OracleCommand();

  @override
  void executeCommand(String query) {
    print('OracleCommand: $query');
  }
}
