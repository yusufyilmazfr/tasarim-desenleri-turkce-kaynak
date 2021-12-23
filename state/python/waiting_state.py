from vending_machine_state import VendingMachineState


class WaitingState(VendingMachineState):
    """
    Farklı durumların meydana geldiği sınıf.
    UML diyagramındaki State (VendingMachineState) yapısından türer.
    UML diyagramındaki ConcreteState yapısına denk gelmektedir.
    """

    def handle_state(self, context):
        """
        WaitingState durumunda herhangi bir yeni duruma geçmeye gerek yok.
        Buradan sonraki durum gelen istek ile aksiyon alacaktır.
        """
        print("WaitingState: Otomata herhangi bir aksiyon bekliyor.")
