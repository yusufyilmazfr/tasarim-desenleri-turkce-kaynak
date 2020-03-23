package ChainOfResponsibility

fun main(args: Array<String>) {
    val image = Image("tatil-fotografim", "JPG")

    val jpegHandler = JPEGHandler()
    val jpgHandler = JPGHandler()
    val customHandler = CustomHandler()

    // Zincirlerin birbirleri ile bağlantısının yapıldığı yerdir.
    // JPEG bu işlemi gerçekleştiremezse JPG'e aktarır o da Custom'a aktarır.
    jpegHandler.setNextHandler(jpgHandler)
    jpgHandler.setNextHandler(customHandler)

    jpegHandler.handleRequest(image)
}
