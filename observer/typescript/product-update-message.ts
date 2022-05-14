// Bildirilecek olan nesnelere paremetre olarak giden mesaj.
// UML diyagramı ile ilgisi yoktur.
export class ProductUpdateMessage {
  public productName: string;
  public message: string;

  public toString(): string {
    return `${this.productName} updated. Message: ${this.message}`;
  }
}
