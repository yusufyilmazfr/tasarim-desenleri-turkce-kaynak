# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 22.12.2021
from vending_machine_state import VendingMachineState
from initialize_state import InitializeState
from preparing_state import PreparingState


class VendingMachine:
    """
    Durumu izlenecek olan sınıftır.
    UML diyagramındaki Context yapısına denk gelmektedir.
    """
    _state: VendingMachineState

    def __init__(self):
        # Otomata örneği oluştuğu zaman başlangıç durumuna geçiyor.
        self.set_state(InitializeState())

    def set_state(self, state: VendingMachineState):
        self._state = state
        self._state.handle_state(self)

    def request_product(self, product_name: str, price: float):
        # Burada ürünlere ait iş kodları olacaktır.
        # Ürün kontrolü, fiyatlandırma gibi kontroller.
        # Ürün ve fiyat olarak bir problemin olmadığı var sayılsın.
        self.set_state(PreparingState())
