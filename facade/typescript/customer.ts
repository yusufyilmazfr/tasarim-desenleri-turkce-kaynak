// Banka müşterimizi temsili oluşturan sınıf.
export class Customer {
  public firstName: string;
  public lastName: string;

  constructor(firstName: string, lastName: string) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
}
