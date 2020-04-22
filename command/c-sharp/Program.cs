using System;
using System.Collections.Generic;

namespace Command
{
    class Program
    {
        static void Main(string[] args)
        {
            StockManager stockManager = new StockManager("iPhone", 200);

            BuyStock buyStock = new BuyStock(stockManager);
            SellStock sellStock = new SellStock(stockManager);

            StockController stockController = new StockController();

            stockController.TakeOrder(buyStock);
            stockController.TakeOrder(sellStock);
            stockController.TakeOrder(sellStock);


            stockController.PlaceOrders();
            // output:
            //  Stock: iPhone, 200 bought!
            //  Stock: iPhone, 200 sold!
            //  Stock: iPhone, 200 sold!
        }
    }
}
