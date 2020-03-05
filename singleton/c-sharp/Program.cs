using System;

namespace Singleton
{
    class Program
    {
        static void Main(string[] args)
        {
            Database firstInstanceRequest = Database.GetInstance();
            Database secondInstanceRequest = Database.GetInstance();

            bool isEquals = firstInstanceRequest == secondInstanceRequest;

            Console.WriteLine($"Database reference is equals: {isEquals}"); //output: Database reference is equals: True
        }
    }
}
