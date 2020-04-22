package Flyweight;

import java.util.Dictionary;
import java.util.Hashtable;

// Flyweight (Box) havuzunu tutacak sınıftır.
// Eğer daha önceden nesne oluşturulmamışsa havuza atılacak.
// Oluşturulmuş ise de havuzdan seçilip verilecektir.
// UML diyagramındaki FlyweightFactory sınıfına denk gelmektedir.
class BoxFactory {
    private Dictionary<BoxColor, Box> _boxes;

    public BoxFactory() {
        _boxes = new Hashtable<>();
    }

    public Box get(BoxColor boxColor) {
        if (_boxes.get(boxColor) != null) {
            return _boxes.get(boxColor);
        }

        Box box = null;

        if (boxColor == BoxColor.BLACK) {
            box = new BlackBox(20, 20);
        } else if (boxColor == BoxColor.BLUE) {
            box = new BlueBox(20, 20);
        }

        _boxes.put(boxColor, box);
        return box;
    }
}