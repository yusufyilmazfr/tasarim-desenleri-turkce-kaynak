# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 20.12.2021
from abstract_handler import AbstractHandler
from image import Image


class CustomHandler(AbstractHandler):
    """
    Herhangi bir tipteki dosyayı dönüştüren sınıf.
    UML diyagramındaki ConcreteHandler sınıfına denk gelmektedir.
    """

    def handle_request(self, image: Image):
        if image.extension == "OtherExtension":
            # Herhangi bir tipteki dosyanın işlemine ait dönüştürme kodları işlemleri.
            print("OtherExtension to PNG")
        else:
            return super().handle_request(image)
