package Observer;

// Bildirilecek olan nesnelere paremetre olarak giden mesaj.
// UML diyagramı ile ilgisi yoktur.
class ProductUpdateMessage {
    public String productName;
    public String message;

    @Override
    public String toString() {
        return String.format("%s  updated. Message:%s", productName, message);
    }
}