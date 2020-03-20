using System;

namespace Prototype
{
    class Program
    {
        static void Main(string[] args)
        {
            Employee gulizar = new Employee("Gülizar", "Yılmaz");
            Employee cloneGulizar = gulizar.Clone();

            // Aynı nesne örneklerini farklı referanslarda tutuyor.
            // Birbirinin aynısı ve farklı referanslarda olan nesneler elde ettik.
            Console.WriteLine(gulizar == cloneGulizar);
        }
    }
}
