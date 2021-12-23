from base_handler import BaseHandler
from abc import abstractmethod
from image import Image


class AbstractHandler(BaseHandler):
    """
    Zincirin bir sonraki halkasının referansının tutulduğu sınıftır.
    İşlemi gerçekleştirecek olan metot tanımı bulunur.
    UML diyagramındaki BaseHandler sınıfına denk gelmektedir.
    """
    _next_handler: BaseHandler = None

    def set_next_handler(self, next_handler: BaseHandler):
        self._next_handler = next_handler
        return next_handler

    @abstractmethod
    def handle_request(self, image: Image):
        if self._next_handler:
            return self._next_handler.handle_request(image)
        return None
