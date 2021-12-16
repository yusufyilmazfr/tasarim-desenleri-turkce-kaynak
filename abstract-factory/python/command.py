# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 16.12.2021
from abc import ABC, abstractmethod


class Command(ABC):
    @abstractmethod
    def execute_command(self, query):
        pass
