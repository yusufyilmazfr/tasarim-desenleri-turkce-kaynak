package main

import "fmt"

func main() {
	products := NewProductCatalog("Ürünler")

	phones := NewProductCatalog("Telefonlar")

	iphone := NewProductCatalog("Iphone Telefonlar")
	samsung := NewProductCatalog("Samsung Telefonlar")

	iphone5product := NewProduct("Iphone 5 Telefon")
	samsungGalaxyProduct := NewProduct("Samsung Galaxy Telefin")

	// En üst hiyerarşiye telefon düğümü ekleniyor.
	products.Add(phones)

	// Telefon hiyerarşisine Samsung ve iPhone düğümleri ekleniyor.
	phones.Add(iphone)
	phones.Add(samsung)

	// iPhone hiyerarşisine iPhone5 yaprağı (En alt yapıdır, içerisinde bir düğüm içermez) ekleniyor.
	iphone.Add(iphone5product)

	// Samsung hiyerarşisine Samsung Galaxy yaprağı (En alt yapıdır, içerisinde bir düğüm içermez) ekleniyor.
	samsung.Add(samsungGalaxyProduct)

	products.DrawHierarchy()
	//             -Ürünler
	//             --Telefonlar
	//             ---iPhone Telefonlar
	//             ----iPhone 5 Telefon
	//             --Samsung Telefonlar
	//             ---Samsung Galaxy Telefon

	fmt.Println()

	// Telefon hiyerarşisinden iphone düğümü siliniyor.
	phones.Remove(iphone)

	products.DrawHierarchy()
}
