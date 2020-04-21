package Visitor;

// Visitor arayüzünü ve burada tanımlı olan metotları uygular.
// Sonradan eklenmek istenen işlemler burada yer alır.
// UML diyagramındaki ConcreteVisitor yapısına denk gelir.
class XmlExportVisitor implements IBookExportVisitor {

    public void exportVisit(Magazine magazine) {
        // Parametre olarak gelen örneğin XML'e çevrilmesi işlemleri yer alacaktır.
        System.out.println(magazine.name + " exported by XmlExportVisitor");
    }

    public void exportVisit(Encyclopedia encyclopedia) {
        // Parametre olarak gelen örneğin XML'e çevrilmesi işlemleri yer alacaktır.
        System.out.println(encyclopedia.name + " exported by XmlExportVisitor");
    }
}
