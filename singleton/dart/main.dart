import 'database.dart';

void main() {
  const Database db1 = Database.instance;
  const Database db2 = Database.instance;

  const bool equal = db1 == db2;

  print('Database instances are equal: $equal');
}
