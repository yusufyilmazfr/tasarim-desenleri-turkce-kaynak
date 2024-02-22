import 'connection.dart';

final class OracleConnection implements Connection {
  const OracleConnection();

  @override
  bool openConnection() {
    return true;
  }

  @override
  bool closeConnection() {
    return true;
  }
}
