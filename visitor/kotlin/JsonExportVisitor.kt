package Visitor

// Visitor arayüzünü ve burada tanımlı olan metotları uygular.
// Sonradan eklenmek istenen işlemler burada yer alır.
// UML diyagramındaki ConcreteVisitor yapısına denk gelir.
internal class JsonExportVisitor : IBookExportVisitor {

    override fun exportVisit(magazine: Magazine) {
        // Parametre olarak gelen örneğin JSON'a çevrilmesi işlemleri yer alacaktır.
        println(magazine.name!! + " exported by JsonExportVisitor")
    }

    override fun exportVisit(encyclopedia: Encyclopedia) {
        // Parametre olarak gelen örneğin JSON'a çevrilmesi işlemleri yer alacaktır.
        println(encyclopedia.name!! + " exported by JsonExportVisitor")
    }
}
