using System;

namespace ChainOfResponsibility
{
    class Program
    {
        static void Main(string[] args)
        {
            Image image = new Image("tatil-fotografim", "JPG");

            JPEGHandler jpegHandler = new JPEGHandler();
            JPGHandler jpgHandler = new JPGHandler();
            CustomHandler customHandler = new CustomHandler();

            // Zincirlerin birbirleri ile bağlantısının yapıldığı yerdir.
            // JPEG bu işlemi gerçekleştiremezse JPG'e aktarır o da Custom'a aktarır.
            jpegHandler.SetNextHandler(jpgHandler);
            jpgHandler.SetNextHandler(customHandler);

            jpegHandler.HandleRequest(image);
        }
    }
}
