package main

// StockController Command (OrderCommand) arayüzünü uygulayan sınıf referansını tutar.
// Metotun ne zaman çağrılacağını belirtir.
// UML diyagramındaki Invoker sınıfına denk gelmektedir.
type StockController struct {
	orderCommands []OrderCommand
}

func NewStockController() *StockController {
	return &StockController{
		orderCommands: make([]OrderCommand, 0),
	}
}

func (c *StockController) TakeOrder(command OrderCommand) {
	c.orderCommands = append(c.orderCommands, command)
}

func (c StockController) PlaceOrders() {
	for _, command := range c.orderCommands {
		command.Execute()
	}
}
