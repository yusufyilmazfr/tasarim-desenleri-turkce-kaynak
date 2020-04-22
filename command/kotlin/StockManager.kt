package Command

// Komutları nesneler haline getirelecek olan sınıf.
// UML diyagramındaki Receiver sınıfına denk gelmektedir.
internal class StockManager(private val _name: String, private val _quantity: Int) {

    fun buy() {
        val message = String.format("Stock: %s, %s bought!", _name, _quantity)
        println(message)
    }

    fun sell() {
        val message = String.format("Stock: %s, %s sold!", _name, _quantity)
        println(message)
    }
}