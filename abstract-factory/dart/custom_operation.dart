import 'command.dart';
import 'connection.dart';
import 'i_database_factory.dart';

final class CustomOperation {
  final IDatabaseFactory _databaseFactory;
  late final Connection _connection;
  late final Command _command;

  CustomOperation(this._databaseFactory) {
    _command = _databaseFactory.createCommand();
    _connection = _databaseFactory.createConnection();
  }

  void removeById(int id) {
    _connection.openConnection();
    _command.executeCommand("DELETE ...");
    _connection.closeConnection();
  }
}
