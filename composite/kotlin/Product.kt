package Composite

// Somut yapımızdır.
// UML diyagramındaki Leaf kısmına denk gelmektedir.
// Hiyerarşinin en alt tabakasını temsil etmektedir.
internal class Product(private val _name: String) : ICatalogComponent {

    override fun drawHierarchy() {
        println(_name)
    }
}
