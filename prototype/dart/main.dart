import 'employee.dart';

void main() {
  const Employee gulizar = Employee('Gülizar', 'Yılmaz');
  final Employee cloneGulizar = gulizar.clone();
  print(gulizar == cloneGulizar);
}
