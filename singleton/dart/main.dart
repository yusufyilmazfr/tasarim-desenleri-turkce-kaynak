import 'database.dart';

void main() {
  final Database db1 = Database.instance;
  final Database db2 = Database.instance;

  final bool equal = db1 == db2;

  print('Database instances are equal: $equal'); //output: Database instances are equal: true
}
