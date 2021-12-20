# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 20.12.2021
from abc import ABC, abstractmethod
from context import Context


class JobExpression(ABC):
    @abstractmethod
    def interpret(self, context: Context):
        pass
