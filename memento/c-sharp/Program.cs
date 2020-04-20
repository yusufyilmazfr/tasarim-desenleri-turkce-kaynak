using System;
using System.Collections.Generic;

namespace Memento
{
    class Program
    {
        static void Main(string[] args)
        {
            TextOriginator textOriginator = new TextOriginator();

            textOriginator.Text = "asm";
            textOriginator.CursorPosition = 3;

            // Anlık durum yığına ekleniyor.
            textOriginator.Save();


            textOriginator.Text = "asmi";
            textOriginator.CursorPosition = 4;

            // Anlık durum yığına ekleniyor.
            textOriginator.Save();

            textOriginator.Text = "asmin";
            textOriginator.CursorPosition = 5;

            // Anlık durum yığına ekleniyor.
            textOriginator.Save();

            // Yığındaki bir önceki duruma geçiyor.
            textOriginator.Undo();
            Console.WriteLine(textOriginator.ToString());

            // Yığındaki bir önceki duruma geçiyor.
            textOriginator.Undo();
            Console.WriteLine(textOriginator.ToString());

            // Yığındaki bir önceki duruma geçiyor.
            textOriginator.Undo();
            Console.WriteLine(textOriginator.ToString());

            //output:
            //  text: asmin, cursor position: 5
            //  text: asmi, cursor position: 4
            //  text: asm, cursor position: 3
        }
    }
}