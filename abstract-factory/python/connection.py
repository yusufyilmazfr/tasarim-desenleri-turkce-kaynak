from abc import ABC, abstractmethod


class Connection(ABC):
    @abstractmethod
    def open_connection(self):
        pass

    @abstractmethod
    def close_connection(self):
        pass
