// Sepette bulunan ürünleri temsil eden sınıf.
// Ürün kodu ve fiyat bilgileri temel olarak yeterlidir.
export class Item {
  constructor(
    private readonly upcCode: string,
    private readonly price: number,
  ) {}

  public getPrice(): number {
    return this.price;
  }
}
