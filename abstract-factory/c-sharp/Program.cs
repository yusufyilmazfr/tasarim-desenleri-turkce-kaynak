using System;

namespace AbstractFactory
{
    class Program
    {
        static void Main(string[] args)
        {
            CustomOperation customOperation = new CustomOperation(new OracleDatabaseFactory());
            customOperation.RemoveById(1);


            Console.WriteLine("Hello World!");
        }
    }
}
