package Composite;

// Somut yapımızdır.
// UML diyagramındaki Leaf kısmına denk gelmektedir.
// Hiyerarşinin en alt tabakasını temsil etmektedir.
class Product implements ICatalogComponent {
    private String _name;

    public Product(String name) {
        _name = name;
    }

    public void drawHierarchy() {
        System.out.println(_name);
    }
}
