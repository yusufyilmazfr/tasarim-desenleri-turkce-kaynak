# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 20.12.2021
from abstract_handler import AbstractHandler
from image import Image


class JPEGHandler(AbstractHandler):
    """
    JPEG dosyalarını dönüştüren sınıf.
    UML diyagramındaki ConcreteHandler sınıfına denk gelmektedir.
    """

    def handle_request(self, image: Image):
        if image.extension == "JPEG":
            # JPEG işlemine ait dönüştürme kodları işlemleri.
            print("JPEG to PNG")
        else:
            print("not related to JPEG Handler.")
            # Bu sınıfa ait bir işlem değilse zincirin bir sonraki halkasına aktarılır.
            return super().handle_request(image)
