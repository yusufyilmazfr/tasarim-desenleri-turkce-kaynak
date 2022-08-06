package main

func main() {
	stockManager := NewStockManager("iPhone", 200)

	buyStock := NewBuyStock(stockManager)
	sellStock := NewSellStock(stockManager)

	stockController := NewStockController()

	stockController.TakeOrder(buyStock)
	stockController.TakeOrder(sellStock)
	stockController.TakeOrder(sellStock)

	stockController.PlaceOrders()
	// output:
	//  Stock: iPhone, 201 bought!
	//  Stock: iPhone, 200 sold!
	//  Stock: iPhone, 199 sold!
}
