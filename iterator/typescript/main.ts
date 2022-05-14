import {EmployeeListAggregate} from "./employee-list-aggregate";
import {Employee} from "./employee";

function main() {
  const employeeListAggregate = new EmployeeListAggregate();

  const yusuf = new Employee(1, 'Yusuf', 'Yılmaz');
  const arafat = new Employee(2, 'Arafat', 'Önlük');
  const derya = new Employee(3, 'Derya', 'Obi');

  const iterator = employeeListAggregate.createIterator();

  while (iterator.hasNext()) {
    const currentEmployee = iterator.getCurrentItem();
    console.log(`${currentEmployee.firstName} ${currentEmployee.lastName}`);
  }

  // output:
  //  Yusuf Yılmaz
  //  Arafat Önlük
  //  Derya Obi
}
