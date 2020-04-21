using System;
using System.Collections.Generic;
using System.Text;

namespace Visitor
{
    // Visitor arayüzünü ve burada tanımlı olan metotları uygular.
    // Sonradan eklenmek istenen işlemler burada yer alır.
    // UML diyagramındaki ConcreteVisitor yapısına denk gelir.
    class JsonExportVisitor : IBookExportVisitor
    {
        public void ExportVisit(Magazine magazine)
        {
            // Parametre olarak gelen örneğin JSON'a çevrilmesi işlemleri yer alacaktır.
            Console.WriteLine($"{magazine.name} exported by JsonExportVisitor");
        }

        public void ExportVisit(Encyclopedia encyclopedia)
        {
            // Parametre olarak gelen örneğin JSON'a çevrilmesi işlemleri yer alacaktır.
            Console.WriteLine($"{encyclopedia.name} exported by JsonExportVisitor");
        }
    }
}
