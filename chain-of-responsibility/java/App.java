package ChainOfResponsibility;

public class App {
    public static void main(String[] args) {
        Image image = new Image("tatil-fotografim", "JPG");

        JPEGHandler jpegHandler = new JPEGHandler();
        JPGHandler jpgHandler = new JPGHandler();
        CustomHandler customHandler = new CustomHandler();

        // Zincirlerin birbirleri ile bağlantısının yapıldığı yerdir.
        // JPEG bu işlemi gerçekleştiremezse JPG'e aktarır o da Custom'a aktarır.
        jpegHandler.setNextHandler(jpgHandler);
        jpgHandler.setNextHandler(customHandler);

        jpegHandler.handleRequest(image);
    }
}
