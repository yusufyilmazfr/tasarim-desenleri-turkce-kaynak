import 'command.dart';

final class MysqlCommand implements Command {
  const MysqlCommand();

  @override
  void executeCommand(String query) {
    print('MysqlCommand: $query');
  }
}
