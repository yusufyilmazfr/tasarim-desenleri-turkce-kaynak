# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 16.12.2021
from abc import ABC, abstractmethod


class DatabaseFactory(ABC):
    @abstractmethod
    def create_command(self):
        pass

    @abstractmethod
    def create_connection(self):
        pass
