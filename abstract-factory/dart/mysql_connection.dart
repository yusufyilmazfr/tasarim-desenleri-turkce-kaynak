import 'connection.dart';

final class MysqlConnection implements Connection {
  const MysqlConnection();

  @override
  bool openConnection() {
    // MySQL veri tabanı bağlantısının açılması için
    // Gerekli operasyonel işlemler...
    return true;
  }

  @override
  bool closeConnection() {
    // MySQL veri tabanı bağlantısının kapatılması için
    // Gerekli operasyonel işlemler...
    return true;
  }
}
