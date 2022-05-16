import {IIterator} from "./iterator.interface";
import {Employee} from "./employee";
import {EmployeeListAggregate} from "./employee-list-aggregate";

// Iterator arayüzünü ve koleksiyon üzerinde dolaşmak için gerekli metotları uygular.
// Veriler üzerinde dolanma işlemleri burada gerçekleştirilecektir.
// ConcreteAggregate (EmployeeListAggregate) sınıfı ile birlikte çalışır
export class EmployeeIterator implements IIterator<Employee> {
  private currentIndex: number;

  constructor(private readonly employeeListAggregate: EmployeeListAggregate ) {
    this.currentIndex = 0;
  }

  public getCurrentItem(): Employee {
    return this.employeeListAggregate.get(this.currentIndex++);
  }

  public hasNext(): boolean {
    return this.employeeListAggregate.count() > this.currentIndex;
  }
}
