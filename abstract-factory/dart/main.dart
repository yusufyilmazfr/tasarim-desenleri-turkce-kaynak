import 'custom_operation.dart';
import 'oracle_database_factory.dart';

void main() {
  final CustomOperation customOperation = CustomOperation(const OracleDatabaseFactory());
  customOperation.removeById(1);
}
