# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 20.12.2021
from image import Image
from jpg_handler import JPGHandler
from jpeg_handler import JPEGHandler
from custom_handler import CustomHandler

if __name__ == '__main__':
    image = Image("tatil-fotografim", "OtherExtension")
    jpeg_handler = JPEGHandler()
    jpg_handler = JPGHandler()
    custom_handler = CustomHandler()

    # Zincirlerin birbirleri ile bağlantısının yapıldığı yerdir.
    # JPEG bu işlemi gerçekleştiremezse JPG'e aktarır o da Custom'a aktarır.
    jpg_handler.set_next_handler(jpeg_handler).set_next_handler(custom_handler)
    jpg_handler.handle_request(image)
    """
    Output:
    not related to JPG Handler.
    not related to JPEG Handler.
    OtherExtension to PNG
    """
