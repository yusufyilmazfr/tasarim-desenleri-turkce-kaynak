from abc import ABC, abstractmethod


class JsonSerializer(ABC):
    """
    UML diyagramındaki Target'a denk gelmektedir.
    Sistem bu arayüzü uygulayarak çalışmaktadır.
    """

    @abstractmethod
    def serialize_object(self, obj):
        pass
