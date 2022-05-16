import {IIterator} from "./iterator.interface";
import {Employee} from "./employee";

// Iterator arayüzünü uygulayan sınıf örneklerini elde etmek için metot içerir.
// Bu sayede çeşitli Iterator arayüzünü uygulayan sınıfların örneklerini elde edebiliriz.
// UML diyagramındaki Aggregate arayüzüne denk gelmektedir.
export interface IEmployeeAggregate {
  createIterator(): IIterator<Employee>;
}
