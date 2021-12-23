from catalog_component import CatalogComponent


class ProductCatalog(CatalogComponent):
    """
    Somut yapımızdır.
    UML diyagramındaki Composite kısmına denk gelmektedir.
    Component (ICatalogComponent) listesi tutmaktadır.
    """

    def __init__(self, name):
        self.name = name
        self._components = set()

    def add(self, catalog_component: CatalogComponent):
        self._components.add(catalog_component)

    def remove(self, catalog_component: CatalogComponent):
        self._components.discard(catalog_component)

    def draw_hierarchy(self):
        print(self.name)
        for component in self._components:
            component.draw_hierarchy()
