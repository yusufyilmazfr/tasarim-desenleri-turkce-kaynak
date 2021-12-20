# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 20.12.2021
from abc import ABC, abstractmethod


class OrderCommand(ABC):
    """
    Temel arayüzdür.
    Komutların çalıştırılması için temel metotu içermektedir.
    UML diyagramındaki Command arayüzüne denk gelmektedir.
    """

    @abstractmethod
    def execute(self):
        pass
