using System;
using System.Collections.Generic;
using System.Text;

namespace Visitor
{
    // Visitor arayüzünü ve burada tanımlı olan metotları uygular.
    // Sonradan eklenmek istenen işlemler burada yer alır.
    // UML diyagramındaki ConcreteVisitor yapısına denk gelir.
    class XmlExportVisitor : IBookExportVisitor
    {
        public void ExportVisit(Magazine magazine)
        {
            // Parametre olarak gelen örneğin XML'e çevrilmesi işlemleri yer alacaktır.
            Console.WriteLine($"{magazine.name} exported by XmlExportVisitor");
        }

        public void ExportVisit(Encyclopedia encyclopedia)
        {
            // Parametre olarak gelen örneğin XML'e çevrilmesi işlemleri yer alacaktır.
            Console.WriteLine($"{encyclopedia.name} exported by XmlExportVisitor");
        }
    }
}
