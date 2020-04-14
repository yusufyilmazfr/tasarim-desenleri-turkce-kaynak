package Composite

fun main(args: Array<String>) {
    val items = ProductCatalog("Ürünler")

    val phones = ProductCatalog("Telefonlar")

    val iPhone = ProductCatalog("iPhone Telefonlar")
    val samsung = ProductCatalog("Samsung Telefonlar")

    val iphone5Item = Product("iPhone 5 Telefon")
    val samsungGalaxyItem = Product("Samsung Galaxy Telefon")

    // En üst hiyerarşiye telefon düğümü ekleniyor.
    items.add(phones)

    // Telefon hiyerarşisine Samsung ve iPhone düğümleri ekleniyor.
    phones.add(iPhone)
    phones.add(samsung)

    // iPhone hiyerarşisine iPhone5 yaprağı (En alt yapıdır, içerisinde bir düğüm içermez) ekleniyor.
    iPhone.add(iphone5Item)

    // Samsung hiyerarşisine Samsung Galaxy yaprağı (En alt yapıdır, içerisinde bir düğüm içermez) ekleniyor.
    samsung.add(samsungGalaxyItem)

    items.drawHierarchy()

    //             -Ürünler
    //             --Telefonlar
    //             ---iPhone Telefonlar
    //             ----iPhone 5 Telefon
    //             --Samsung Telefonlar
    //             ---Samsung Galaxy Telefon

}
