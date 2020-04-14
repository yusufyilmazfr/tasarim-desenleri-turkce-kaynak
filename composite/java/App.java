package Composite;

public class App {
    public static void main(String[] args) {
        ProductCatalog items = new ProductCatalog("Ürünler");

        ProductCatalog phones = new ProductCatalog("Telefonlar");

        ProductCatalog iPhone = new ProductCatalog("iPhone Telefonlar");
        ProductCatalog samsung = new ProductCatalog("Samsung Telefonlar");

        Product iphone5Item = new Product("iPhone 5 Telefon");
        Product samsungGalaxyItem = new Product("Samsung Galaxy Telefon");

        // En üst hiyerarşiye telefon düğümü ekleniyor.
        items.add(phones);

        // Telefon hiyerarşisine Samsung ve iPhone düğümleri ekleniyor.
        phones.add(iPhone);
        phones.add(samsung);

        // iPhone hiyerarşisine iPhone5 yaprağı (En alt yapıdır, içerisinde bir düğüm içermez) ekleniyor.
        iPhone.add(iphone5Item);

        // Samsung hiyerarşisine Samsung Galaxy yaprağı (En alt yapıdır, içerisinde bir düğüm içermez) ekleniyor.
        samsung.add(samsungGalaxyItem);

        items.drawHierarchy();

        //             -Ürünler
        //             --Telefonlar
        //             ---iPhone Telefonlar
        //             ----iPhone 5 Telefon
        //             --Samsung Telefonlar
        //             ---Samsung Galaxy Telefon

    }
}
