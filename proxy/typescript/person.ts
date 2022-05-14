// Maske siparişini verecek kullanıcıları temsili sınıf.
export class Person {
  public TC: string;
  public address: string;

  constructor(tc: string, address: string) {
    this.TC = tc;
    this.address = address;
  }
}
