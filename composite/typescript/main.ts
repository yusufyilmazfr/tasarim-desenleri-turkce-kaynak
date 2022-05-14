import {ProductCatalog} from "./product-catalog";
import {Product} from "./product";

function main() {
  const items = new ProductCatalog('Ürünler');
  const phones = new ProductCatalog('Telefonlar');
  const iPhone = new ProductCatalog('İPhone Teelfonlar');
  const samsung = new ProductCatalog('Samsung Telefonlar');

  const iphone5Item = new Product('iPhone 5 Telefon');
  const samsungGalaxyItem = new Product('Samsung Galaxy Telefon');

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
  //-Ürünler
  //--Telefonlar
  //---iPhone Telefonlar
  //----iPhone 5 Telefon
  //---Samsung Telefonlar
  //----Samsung Galaxy Telefon
}
