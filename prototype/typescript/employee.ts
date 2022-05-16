import {ICloneablePrototype} from "./cloneable-prototype.interface";

// Employee sınıfına klonlama yeteneği kazandırmak için tanımladığımız arayüzü uyguladık.
export class Employee implements ICloneablePrototype<Employee> {
  public firstName: string;
  public lastName: string;

  constructor(firstName: string, lastName: string) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public clone(): Employee {
    return Object.assign({}, this);
  }
}
