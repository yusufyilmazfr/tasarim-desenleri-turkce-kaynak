import 'connection.dart';

final class OracleConnection implements Connection {
  const OracleConnection();

  @override
  bool openConnection() {
    // Oracle veri tabanı bağlantısının açılması için
    // Gerekli operasyonel işlemler...
    return true;
  }

  @override
  bool closeConnection() {
    // Oracle veri tabanı bağlantısının kapatılması için
    // Gerekli operasyonel işlemler...
    return true;
  }
}
