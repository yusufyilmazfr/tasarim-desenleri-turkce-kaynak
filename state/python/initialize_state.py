from vending_machine_state import VendingMachineState
from waiting_state import WaitingState


class InitializeState(VendingMachineState):
    """
    Farklı durumların meydana geldiği sınıf.
    UML diyagramındaki State (VendingMachineState) yapısından türer.
    UML diyagramındaki ConcreteState yapısına denk gelmektedir.
    """

    def handle_state(self, context):
        # Başlangıç durumu ayarları yapıldıktan sonra WaitingState (hazır) durumuna geçer.
        print("InitializeState: Ön hazırlıklar yapılıyor.")
        context.set_state(WaitingState())
