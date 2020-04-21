using System;

namespace Visitor
{
    class Program
    {
        static void Main(string[] args)
        {
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

            earth.Accept(xmlExportVisitor);
            daily.Accept(jsonExportVisitor);

            // output:
            //  Big Earth!exported by XmlExportVisitor
            //  Daily Magazine exported by JsonExportVisitor
        }
    }

}
