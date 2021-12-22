# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 22.12.2021
from vending_machine_state import VendingMachineState
from waiting_state import WaitingState


class DeliveryState(VendingMachineState):
    """
    Farklı durumların meydana geldiği sınıf.
    UML diyagramındaki State (VendingMachineState) yapısından türer.
    UML diyagramındaki ConcreteState yapısına denk gelmektedir.
    """

    def handle_state(self, context):
        # DeliveryState durumunda otomatadan ürünün teslim işlemleri yapılmaktadır.
        # Ürün verildikten sonra başlangıç, bekleme durumuna geçmektedir. (WaitingState)
        print("DeliveryState: Ürün teslim ediliyor.")
        context.set_state(WaitingState())
