import {IEmployeeAggregate} from "./employee-aggregate.interface";
import {Employee} from "./employee";
import {IIterator} from "./iterator.interface";
import {EmployeeIterator} from "./employee-iterator";

// Aggregate (IEmployeeAggregate) arayüzünü uygular ve Iterator arayüzünü uygulayan sınıf örneği üretir.
// Değerlerin referansları burada bulunur.
// UML diyagramındaki ConcreteAggregate  sınıfına denk gelmektedir.
export class EmployeeListAggregate implements IEmployeeAggregate {
  private readonly employees: Employee[] = [];

  public add(employee: Employee): void {
    this.employees.push(employee);
  }

  public count(): number {
    return this.employees.length;
  }

  public get(index: number): Employee {
    return this.employees[index];
  }

  public createIterator(): IIterator<Employee> {
    return new EmployeeIterator(this);
  }
}
