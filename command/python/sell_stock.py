from order_command import OrderCommand
from stock_manager import StockManager


class SellStock(OrderCommand):
    """
    Nesnelere dönüştürdüğümüz her bir isteğe denk gelmektedir.
    Command (IOrderCommand) arayüzünü uygular.
    UML diyagramındaki ConcreteCommand sınıfına denk gelmektedir.
    """

    def __init__(self, stock_manager: StockManager):
        self._stock_manager = stock_manager

    def execute(self):
        self._stock_manager.sell()
