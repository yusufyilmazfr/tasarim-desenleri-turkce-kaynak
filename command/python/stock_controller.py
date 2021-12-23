from order_command import OrderCommand


class StockController:
    """
    Command (IOrderCommand) arayüzünü uygulayan sınıf referansını tutar.
    Metotun ne zaman çağrılacağını belirtir.
    UML diyagramındaki Invoker sınıfına denk gelmektedir.
    """

    def __init__(self):
        self._order_commands = []

    def take_order(self, command: OrderCommand):
        self._order_commands.append(command)

    def place_orders(self):
        for command in self._order_commands:
            command.execute()
