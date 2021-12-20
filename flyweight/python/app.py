# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 17.12.2021
from box_factory import BoxFactory
from box_color import BoxColor

if __name__ == '__main__':
    box_factory = BoxFactory()
    black_box_1 = box_factory.get(BoxColor.Black)
    black_box_2 = box_factory.get(BoxColor.Black)
    black_box_3 = box_factory.get(BoxColor.Black)
    blue_box_1 = box_factory.get(BoxColor.Blue)

    black_box_1.draw(97, 37)
    black_box_2.draw(34, 78)
    black_box_3.draw(74, 193)
    blue_box_1.draw(1, 4)
    """
    output:
    Log: BoxColor.Black new instance is created.
    Log: came from cache
    Log: came from cache
    Log: BoxColor.Blue new instance is created.
    BoxColor.Black box drawn. 97, 37
    BoxColor.Black box drawn. 34, 78
    BoxColor.Black box drawn. 74, 193
    BoxColor.Blue box drawn. 1,4
    """
