import {Image} from "./image";
import {JPEGHandler} from "./jpeg-handler";
import {JPGHandler} from "./jpg-handler";
import {CustomHandler} from "./custom-handler";

function main() {
  const image = new Image('tatil-fotografim', 'JPG');

  const jpegHandler = new JPEGHandler();
  const jpgHandler = new JPGHandler();
  const customHandler = new CustomHandler();

  // Zincirlerin birbirleri ile bağlantısının yapıldığı yerdir.
  // JPEG bu işlemi gerçekleştiremezse JPG'e aktarır o da Custom'a aktarır.
  jpegHandler.setNextHandler(jpgHandler);
  jpgHandler.setNextHandler(customHandler);

  jpegHandler.handleRequest(image);
}
