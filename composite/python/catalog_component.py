from abc import ABC, abstractmethod


class CatalogComponent(ABC):
    """
    Soyut yapımızdır.
    UML diyagramındaki Component kısmına denk gelmektedir.
    Diğer istemci sınıflar bu yapıyı uygular.
    Diğer sınıfların uygulayacağı hiyerarşiyi çizme metotunu içermektedir.
    """

    @abstractmethod
    def draw_hierarchy(self):
        pass
