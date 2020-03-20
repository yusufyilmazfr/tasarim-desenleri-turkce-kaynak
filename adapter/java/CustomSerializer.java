package Adapter;

// Sisteme daha sonradan dahil olan yapı.
// Sistemin kullandığı arayüzü uygulamamaktadır.
class CustomSerializer {
    public String serialize(Object obj) {
        // Gelen nesneyi serilize etmek için temel operasyonel işlemler..
        // Daha sonradan da gerekli değerin geri döndürülmesi...
        return "serialized with CustomSerializer";
    }
}
