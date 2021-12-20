# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 20.12.2021
from abstract_handler import AbstractHandler
from image import Image


class JPGHandler(AbstractHandler):
    """
    JPG dosyalarını dönüştüren sınıf.
    UML diyagramındaki ConcreteHandler sınıfına denk gelmektedir.
    """

    def handle_request(self, image: Image):
        if image.extension == 'JPG':
            # JPG işlemine ait dönüştürme kodları işlemleri.
            print("JPG to PNG")
        else:
            # Bu sınıfa ait bir işlem değilse zincirin bir sonraki halkasına aktarılır.
            print("not related to JPG Handler.")
            super().handle_request(image)
