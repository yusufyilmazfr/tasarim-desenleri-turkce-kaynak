using System;
using System.Collections.Generic;
using System.Text;

namespace Flyweight
{
    // Flyweight (Box) havuzunu tutacak sınıftır.
    // Eğer daha önceden nesne oluşturulmamışsa havuza atılacak.
    // Oluşturulmuş ise de havuzdan seçilip verilecektir.
    // UML diyagramındaki FlyweightFactory sınıfına denk gelmektedir. 
    class BoxFactory
    {
        private Dictionary<BoxColor, Box> _boxes;

        public BoxFactory()
        {
            _boxes = new Dictionary<BoxColor, Box>();
        }


        public Box Get(BoxColor boxColor)
        {
            if (_boxes.ContainsKey(boxColor))
            {
                return _boxes[boxColor];
            }

            Box box = null;

            if (boxColor == BoxColor.Black)
            {
                box = new BlackBox(20, 20);
            }
            else if (boxColor == BoxColor.Blue)
            {
                box = new BlueBox(20, 20);
            }

            _boxes.Add(boxColor, box);
            return box;
        }
    }
}
