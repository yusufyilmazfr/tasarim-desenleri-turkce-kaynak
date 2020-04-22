package Flyweight

import java.util.Dictionary
import java.util.Hashtable

// Flyweight (Box) havuzunu tutacak sınıftır.
// Eğer daha önceden nesne oluşturulmamışsa havuza atılacak.
// Oluşturulmuş ise de havuzdan seçilip verilecektir.
// UML diyagramındaki FlyweightFactory sınıfına denk gelmektedir.
internal class BoxFactory {
    private val _boxes: Dictionary<BoxColor, Box>

    init {
        _boxes = Hashtable()
    }

    fun get(boxColor: BoxColor): Box? {
        if (_boxes.get(boxColor) != null) {
            return _boxes.get(boxColor)
        }

        var box: Box? = null

        if (boxColor === BoxColor.BLACK) {
            box = BlackBox(20, 20)
        } else if (boxColor === BoxColor.BLUE) {
            box = BlueBox(20, 20)
        }

        _boxes.put(boxColor, box)
        return box
    }
}