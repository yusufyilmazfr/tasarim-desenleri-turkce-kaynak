from stock_manager import StockManager
from buy_stock import BuyStock
from sell_stock import SellStock
from stock_controller import StockController

if __name__ == '__main__':
    stock_manager = StockManager("iPhone", 200)
    buy_stock = BuyStock(stock_manager)
    sell_stock = SellStock(stock_manager)

    stock_controller = StockController()

    stock_controller.take_order(buy_stock)
    stock_controller.take_order(sell_stock)
    stock_controller.take_order(sell_stock)

    stock_controller.place_orders()
    """
    output:
    Stock: iPhone, 200 bought!
    Stock: iPhone, 200 sold!
    Stock: iPhone, 200 sold!
    """
