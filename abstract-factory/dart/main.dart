import 'custom_operation.dart';
import 'oracle_database_factory.dart';

void main() {
  CustomOperation customOperation = CustomOperation(OracleDatabaseFactory());
  customOperation.removeById(1);
}
