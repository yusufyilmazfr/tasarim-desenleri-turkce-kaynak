from abc import ABC, abstractmethod
from context import Context


class JobExpression(ABC):
    @abstractmethod
    def interpret(self, context: Context):
        pass
