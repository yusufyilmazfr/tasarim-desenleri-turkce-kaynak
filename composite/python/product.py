from catalog_component import CatalogComponent


class Product(CatalogComponent):
    """
    Somut yapımızdır.
    UML diyagramındaki Leaf kısmına denk gelmektedir.
    Hiyerarşinin en alt tabakasını temsil etmektedir.
    """

    def __init__(self, name):
        self._name = name

    def draw_hierarchy(self):
        print(self._name)
