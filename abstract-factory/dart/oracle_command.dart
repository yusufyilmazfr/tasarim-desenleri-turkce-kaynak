import 'command.dart';

final class OracleCommand implements Command {
  const OracleCommand();

  @override
  void executeCommand(String query) {
    // Gelen sorgunun çalıştırılması için
    // Gerekli operasyonel işlemler...
    print('OracleCommand: $query');
  }
}
