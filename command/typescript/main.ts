import {StockManager} from "./stock-manager";
import {BuyStock} from "./buy-stock";
import {SellStock} from "./sell-stock";
import {StockController} from "./stock-controller";

function main() {
  const stockManager = new StockManager('iPhone', 200);

  const buyStock = new BuyStock(stockManager);
  const sellStock = new SellStock(stockManager);

  const stockController = new StockController();

  stockController.takeOrder(buyStock);
  stockController.takeOrder(sellStock);
  stockController.takeOrder(sellStock);

  stockController.placeOrders();
  // output:
  //  Stock: iPhone, 200 bought!
  //  Stock: iPhone, 200 sold!
  //  Stock: iPhone, 200 sold!
}
