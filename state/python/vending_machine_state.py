from __future__ import annotations
from abc import ABC, abstractmethod

from typing import TYPE_CHECKING

if TYPE_CHECKING:
    """
    SYB: tip ataması yaparken, eğer iki dosya birbiri içerisinde çağırılırsa circular import
    hatası alırsınız. Bunun önüne geçmek için typing kütüphanesinden faydalanırız. Bu kontrol
    sayesine tip kontrolü esnasında kod okunabilsin diye VendingMachine'i import ederken, kod
    çalışırken bu satır çalışmayacak, böylece circular import hatasının önüne geçilmiş olacak.
    """
    from vending_machine import VendingMachine


class VendingMachineState(ABC):
    """
    Davranışların tanımlandığı soyut sınıftır.
    UML diyagramındaki State yapısına denk gelmektedir.
    """

    @abstractmethod
    def handle_state(self, context: VendingMachine):
        pass
