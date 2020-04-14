using System;
using System.Collections;
using System.Collections.Generic;

namespace Composite
{
    class Program
    {
        static void Main(string[] args)
        {
            ProductCatalog items = new ProductCatalog("Ürünler");

            ProductCatalog phones = new ProductCatalog("Telefonlar");

            ProductCatalog iPhone = new ProductCatalog("iPhone Telefonlar");
            ProductCatalog samsung = new ProductCatalog("Samsung Telefonlar");

            Product iphone5Item = new Product("iPhone 5 Telefon");
            Product samsungGalaxyItem = new Product("Samsung Galaxy Telefon");

            // En üst hiyerarşiye telefon düğümü ekleniyor.
            items.Add(phones);

            // Telefon hiyerarşisine Samsung ve iPhone düğümleri ekleniyor.
            phones.Add(iPhone);
            phones.Add(samsung);

            // iPhone hiyerarşisine iPhone5 yaprağı (En alt yapıdır, içerisinde bir düğüm içermez) ekleniyor.
            iPhone.Add(iphone5Item);

            // Samsung hiyerarşisine Samsung Galaxy yaprağı (En alt yapıdır, içerisinde bir düğüm içermez) ekleniyor.
            samsung.Add(samsungGalaxyItem);

            items.DrawHierarchy();

            //             -Ürünler
            //             --Telefonlar
            //             ---iPhone Telefonlar
            //             ----iPhone 5 Telefon
            //             --Samsung Telefonlar
            //             ---Samsung Galaxy Telefon
        }
    }
}
