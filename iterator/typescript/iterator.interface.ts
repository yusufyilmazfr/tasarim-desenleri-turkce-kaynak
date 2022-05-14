// Koleksiyon üzerinde dolaşmak için operasyonların tanımlandığı arayüzdür.
// Bir sonraki elemana geçme, bir sonraki elemanın olup olmadığı gibi.
// UML diyagramındaki Iterator arayüzüne denk gelmektedir.
// Generic bir yapı sağlanarak birçok yerde kullanılması sağlanır.
export interface IIterator<T> {
  hasNext(): boolean;
  getCurrentItem(): T;
}
