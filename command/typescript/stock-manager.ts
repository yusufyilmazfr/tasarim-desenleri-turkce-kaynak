// Komutları nesneler haline getirelecek olan sınıf.
// UML diyagramındaki Receiver sınıfına denk gelmektedir.
export class StockManager {
  private readonly name: string;
  private readonly quantity: number;

  constructor(name: string, quantity: number) {
    this.name = name;
    this.quantity = quantity;
  }

  public buy(): void {
    console.log(`Stock: ${this.name}, ${this.quantity} bought!`);
  }

  public sell(): void {
    console.log(`Stock: ${this.name}, ${this.quantity} sold!`);
  }
}
