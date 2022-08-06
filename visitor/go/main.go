package main

func main() {
	earth := NewEncyclopedia("Big Earth!", "Jose S. Massey", "Encyclopedia")
	daily := NewMagazine("Daily Magazine", "Wayne D. Eaking", "Magazine")

	xmlExport := NewXMLExportVisitor()
	jsonExport := NewJSONExportVisitor()

	earth.Accept(xmlExport)
	daily.Accept(jsonExport)

	// output:
	//  Big Earth!exported by XmlExportVisitor
	//  Daily Magazine exported by JsonExportVisitor
}
