# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 22.12.2021
from vending_machine import VendingMachine

if __name__ == '__main__':
    vending_machine = VendingMachine()
    vending_machine.request_product("COVID-19 Maske", 2)

    """
    output:
    InitializeState: Ön hazırlıklar yapılıyor.
    WaitingState: Otomata herhangi bir aksiyon bekliyor.
    PreparingState: İstenilen ürün hazırlanıyor. Lütfen bekleyiniz
    DeliveryState: Ürün teslim ediliyor.
    WaitingState: Otomata herhangi bir aksiyon bekliyor.
    """
