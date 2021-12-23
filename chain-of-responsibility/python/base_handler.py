from __future__ import annotations

from abc import ABC, abstractmethod
from image import Image


class BaseHandler(ABC):
    """
    SYB: Abstract handlerin sahip olması gereken yapiyi tanımlıyor.
    """

    @abstractmethod
    def set_next_handler(self, next_handler: BaseHandler):
        pass

    @abstractmethod
    def handle_request(self, image: Image):
        pass
