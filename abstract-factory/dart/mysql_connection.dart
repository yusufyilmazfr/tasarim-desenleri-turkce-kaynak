import 'connection.dart';

final class MysqlConnection implements Connection {
  const MysqlConnection();

  @override
  bool openConnection() {
    return true;
  }

  @override
  bool closeConnection() {
    return true;
  }
}
