# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 16.12.2021
from abc import ABC, abstractmethod


class JsonSerializer(ABC):
    """
    UML diyagramındaki Target'a denk gelmektedir.
    Sistem bu arayüzü uygulayarak çalışmaktadır.
    """
    @abstractmethod
    def serialize_object(self, obj):
        pass
