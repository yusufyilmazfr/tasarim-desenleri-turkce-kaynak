from box_color import BoxColor
from black_box import BlackBox
from blue_box import BlueBox


class BoxFactory:
    """
    Flyweight (Box) havuzunu tutacak sınıftır.
    Eğer daha önceden nesne oluşturulmamışsa havuza atılacak.
    Oluşturulmuş ise de havuzdan seçilip verilecektir.
    UML diyagramındaki FlyweightFactory sınıfına denk gelmektedir.
    """

    def __init__(self):
        self._boxes = {}

    def get(self, box_color: BoxColor):
        if box_color in self._boxes.keys():
            print("Log: came from cache")
            return self._boxes[box_color]
        if box_color == BoxColor.Black:
            box = BlackBox(20, 20)
        elif box_color == BoxColor.Blue:
            box = BlueBox(20, 20)
        else:
            # SYB: eger bilinmeyen bir renk gelirse kodun hata vermesi gerekir.
            raise NotImplementedError("Box color didnt defined!")
        self._boxes[box_color] = box
        print(f"Log: {box_color} new instance is created.")
        return box
