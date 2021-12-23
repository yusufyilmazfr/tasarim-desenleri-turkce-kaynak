from abc import ABC, abstractmethod


class DatabaseFactory(ABC):
    @abstractmethod
    def create_command(self):
        pass

    @abstractmethod
    def create_connection(self):
        pass
