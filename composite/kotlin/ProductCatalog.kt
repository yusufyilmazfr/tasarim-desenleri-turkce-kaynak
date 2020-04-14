package Composite

import java.util.ArrayList

// Somut yapımızdır.
// UML diyagramındaki Composite kısmına denk gelmektedir.
// Component (ICatalogComponent) listesi tutmaktadır.
class ProductCatalog(private val _name: String) : ICatalogComponent {

    private val _components: ArrayList<ICatalogComponent> = ArrayList()

    fun add(catalogComponent: ICatalogComponent) {
        _components.add(catalogComponent)
    }

    fun remove(catalogComponent: ICatalogComponent) {
        _components.remove(catalogComponent)
    }

    override fun drawHierarchy() {
        println(_name)
        for (component in _components) {
            component.drawHierarchy()
        }
    }
}