package Adapter

// Sisteme daha sonradan dahil olan yapı.
// Sistemin kullandığı arayüzü uygulamamaktadır.
internal class CustomSerializer {
    fun serialize(obj: Any): String {
        // Gelen nesneyi serilize etmek için temel operasyonel işlemler..
        // Daha sonradan da gerekli değerin geri döndürülmesi...
        return "serialized with CustomSerializer"
    }
}
