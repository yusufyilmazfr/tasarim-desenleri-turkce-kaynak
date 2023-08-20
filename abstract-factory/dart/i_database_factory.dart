import 'command.dart';
import 'connection.dart';

// Oluşturulacak ürünlere ait metotları içerir.
// Oracle ve MySQL için bunların geriye döndüreceği
// Nesneler farklı olacaktır.
abstract class IDatabaseFactory {
  Connection createConnection();
  Command createCommand();
}
