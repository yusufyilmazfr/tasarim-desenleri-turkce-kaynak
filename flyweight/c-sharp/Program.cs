using System;
using System.Collections.Generic;

namespace Flyweight
{
    class Program
    {
        static void Main(string[] args)
        {
            BoxFactory boxFactory = new BoxFactory();

            Box blackBox1 = boxFactory.Get(BoxColor.Black);
            Box blackBox2 = boxFactory.Get(BoxColor.Black);
            Box blackBox3 = boxFactory.Get(BoxColor.Black);
            Box blueBox1 = boxFactory.Get(BoxColor.Blue);

            blackBox1.Draw(97, 37);
            blackBox2.Draw(34, 78);
            blackBox3.Draw(74, 193);
            blueBox1.Draw(1, 4);
            // output:
            //  Black box drawn. 97,37
            //  Black box drawn. 34,78
            //  Black box drawn. 74,193
            //  Blue box drawn. 1,4
        }
    }
}