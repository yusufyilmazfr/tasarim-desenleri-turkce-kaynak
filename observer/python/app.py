# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 22.12.2021
from observer_user import ObserverUser
from samsung import Samsung

if __name__ == '__main__':
    # Güncellemeden etkilenecek olan sınıf örnekleri.
    sezer = ObserverUser()
    mehmet = ObserverUser()
    derya = ObserverUser()
    sema = ObserverUser()
    aleyna = ObserverUser()

    # İzlenecek olan sınıf örneği.
    samsung = Samsung()

    # İzlenecek olan sınıfa etkilenecek olan nesnelerin atanması.
    samsung.add_observer(sezer)
    samsung.add_observer(mehmet)
    samsung.add_observer(derya)
    samsung.add_observer(sema)
    samsung.add_observer(aleyna)

    samsung.change_price()

    """
    output:
    Samsung updated. Message: Samsung's price updated.
    Samsung updated. Message: Samsung's price updated.
    Samsung updated. Message: Samsung's price updated.
    Samsung updated. Message: Samsung's price updated.
    Samsung updated. Message: Samsung's price updated.
    """
