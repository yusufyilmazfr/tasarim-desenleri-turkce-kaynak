package Visitor;

public class App {
    public static void main(String[] args) {
        Book earth = new Encyclopedia();

        earth.name = "Big Earth!";
        earth.author = "Jose S. Massey";
        earth.categoryName = "Encyclopedia";

        Book daily = new Magazine();

        daily.name = "Daily Magazine";
        daily.author = "Wayne D. Eakin";
        daily.categoryName = "Magazine";


        IBookExportVisitor xmlExportVisitor = new XmlExportVisitor();
        IBookExportVisitor jsonExportVisitor = new JsonExportVisitor();

        earth.accept(xmlExportVisitor);
        daily.accept(jsonExportVisitor);

        // output:
        //  Big Earth!exported by XmlExportVisitor
        //  Daily Magazine exported by JsonExportVisitor
    }
}
