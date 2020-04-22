package Iterator

// Koleksiyon üzerinde dolaşmak için operasyonların tanımlandığı arayüzdür.
// Bir sonraki elemana geçme, bir sonraki elemanın olup olmadığı gibi.
// UML diyagramındaki Iterator arayüzüne denk gelmektedir.
// Generic bir yapı sağlanarak birçok yerde kullanılması sağlanır.
internal interface IIterator<T> {
    val currentItem: T
    fun hasNext(): Boolean?
}
