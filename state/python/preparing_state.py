# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 22.12.2021
from vending_machine_state import VendingMachineState
from delivery_state import DeliveryState


class PreparingState(VendingMachineState):
    """
    Farklı durumların meydana geldiği sınıf.
    UML diyagramındaki State (VendingMachineState) yapısından türer.
    UML diyagramındaki ConcreteState yapısına denk gelmektedir.
    """

    def handle_state(self, context):
        # PreparingState durumunda ürün hazırlanması gibi işlemler yapılmaktadır.
        # Buradan sonraki durum ise ürünün verilmesi durumudur. (DeliveryState)
        print("PreparingState: İstenilen ürün hazırlanıyor. Lütfen bekleyiniz")
        context.set_state(DeliveryState())
