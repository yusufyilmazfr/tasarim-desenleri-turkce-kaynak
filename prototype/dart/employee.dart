import 'i_cloneable_prototype.dart';

class Employee implements ICloneablePrototype<Employee> {
  final String firstName;
  final String lastName;

  const Employee(this.firstName, this.lastName);

  @override
  Employee clone() {
    return Employee(firstName, lastName);
  }
}
