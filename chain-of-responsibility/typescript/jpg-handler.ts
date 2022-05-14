import {BaseHandler} from "./base-handler";
import {Image} from "./image";

// JPG dosyalarını dönüştüren sınıf.
// UML diyagramındaki ConcreteHandler sınıfına denk gelmektedir.
export class JPGHandler extends BaseHandler {
  public handleRequest(image: Image): void {
    if(image.extension === 'JPG') {
      console.log('JPG to PNG');
      // JPG işlemine ait dönüştürme kodları işlemleri.
    } else {
      // Bu sınıfa ait bir işlem değilse zincirin bir sonraki halkasına aktarılır.
      this.nextHandler.handleRequest(image);
    }
  }
}
