# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 16.12.2021
from product_catalog import ProductCatalog
from product import Product

if __name__ == '__main__':
    items = ProductCatalog("Ürünler")

    phones = ProductCatalog("Telefonlar")

    iphone = ProductCatalog("iPhone Telefonlar")
    samsung = ProductCatalog("Samsung Telefonlar")

    iphone_5_item = Product("iPhone 5 Telefon")
    samsung_galaxy_item = Product("Samsung Galaxy Telefon")

    # En üst hiyerarşiye telefon düğümü ekleniyor.
    items.add(phones)

    # Telefon hiyerarşisine Samsung ve iPhone düğümleri ekleniyor.
    phones.add(iphone)
    phones.add(samsung)

    # iPhone hiyerarşisine iPhone5 yaprağı (En alt yapıdır, içerisinde bir düğüm içermez) ekleniyor.
    iphone.add(iphone_5_item)

    # Samsung hiyerarşisine Samsung Galaxy yaprağı (En alt yapıdır, içerisinde bir düğüm içermez) ekleniyor.
    samsung.add(samsung_galaxy_item)

    items.draw_hierarchy()
