using System;
using System.Collections.Generic;
using System.Text;

namespace Flyweight
{
    // Flyweight (Box) şablonunu uygulayan sınıftır.
    // UML diyagramındaki ConcreteFlyweight sınıfına denk gelmektedir.
    class BlackBox : Box
    {
        public BlackBox(int width, int height)
        {
            this.width = width;
            this.height = height;
            this.boxColor = BoxColor.Black;
        }

        public override void Draw(int locationX, int locationY)
        {
            Console.WriteLine($"{boxColor} box drawn. {locationX},{locationY}");
        }
    }
}
