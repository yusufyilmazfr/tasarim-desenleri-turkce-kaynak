import {BaseHandler} from "./base-handler";
import {Image} from "./image";

// JPEG dosyalarını dönüştüren sınıf.
// UML diyagramındaki ConcreteHandler sınıfına denk gelmektedir.
export class JPEGHandler extends BaseHandler {
  public handleRequest(image: Image): void {
    if(image.extension === 'JPEG') {
      console.log('JPEG to PNG');
      // JPEG işlemine ait dönüştürme kodları işlemleri.
    } else {
      // Bu sınıfa ait bir işlem değilse zincirin bir sonraki halkasına aktarılır.
      this.nextHandler.handleRequest(image);
    }
  }
}
