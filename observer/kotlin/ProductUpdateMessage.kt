package Observer

// Bildirilecek olan nesnelere paremetre olarak giden mesaj.
// UML diyagramı ile ilgisi yoktur.
internal class ProductUpdateMessage {
    var productName: String? = null
    var message: String? = null

    override fun toString(): String {
        return String.format("%s  updated. Message:%s", productName, message)
    }
}