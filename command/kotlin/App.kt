package Command

fun main(args: Array<String>) {
    val stockManager = StockManager("iPhone", 200)

    val buyStock = BuyStock(stockManager)
    val sellStock = SellStock(stockManager)

    val stockController = StockController()

    stockController.takeOrder(buyStock)
    stockController.takeOrder(sellStock)
    stockController.takeOrder(sellStock)


    stockController.placeOrders()
    // output:
    //  Stock: iPhone, 200 bought!
    //  Stock: iPhone, 200 sold!
    //  Stock: iPhone, 200 sold!
}
