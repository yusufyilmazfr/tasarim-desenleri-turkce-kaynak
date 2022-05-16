// Liste üzerinde gezilecek olan elamnı temsil eden sınıf.
export class Employee {
  public id: number;
  public firstName: string;
  public lastName: string;

  constructor(id: number, firstName: string, lastName: string) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }
}
