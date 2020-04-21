package Visitor

fun main(args: Array<String>) {
    val earth = Encyclopedia()

    earth.name = "Big Earth!"
    earth.author = "Jose S. Massey"
    earth.categoryName = "Encyclopedia"

    val daily = Magazine()

    daily.name = "Daily Magazine"
    daily.author = "Wayne D. Eakin"
    daily.categoryName = "Magazine"


    val xmlExportVisitor = XmlExportVisitor()
    val jsonExportVisitor = JsonExportVisitor()

    earth.accept(xmlExportVisitor)
    daily.accept(jsonExportVisitor)

    // output:
    //  Big Earth!exported by XmlExportVisitor
    //  Daily Magazine exported by JsonExportVisitor
}
