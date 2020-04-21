package Visitor;

// Visitor arayüzünü ve burada tanımlı olan metotları uygular.
// Sonradan eklenmek istenen işlemler burada yer alır.
// UML diyagramındaki ConcreteVisitor yapısına denk gelir.
class JsonExportVisitor implements IBookExportVisitor {

    public void exportVisit(Magazine magazine) {
        // Parametre olarak gelen örneğin JSON'a çevrilmesi işlemleri yer alacaktır.
        System.out.println(magazine.name + " exported by JsonExportVisitor");
    }

    public void exportVisit(Encyclopedia encyclopedia) {
        // Parametre olarak gelen örneğin JSON'a çevrilmesi işlemleri yer alacaktır.
        System.out.println(encyclopedia.name + " exported by JsonExportVisitor");
    }
}
