from abc import ABC, abstractmethod


class Command(ABC):
    @abstractmethod
    def execute_command(self, query):
        pass
