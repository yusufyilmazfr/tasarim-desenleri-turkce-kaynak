// Sisteme daha sonradan dahil olan yapı.
// Sistemin kullandığı arayüzü uygulamamaktadır.
export class CustomSerializer {
  public serialize(obj: object): string {
    // Gelen nesneyi serilize etmek için temel operasyonel işlemler..
    // Daha sonradan da gerekli değerin geri döndürülmesi...
    return "serialized with CustomSerializer";
  }
}
