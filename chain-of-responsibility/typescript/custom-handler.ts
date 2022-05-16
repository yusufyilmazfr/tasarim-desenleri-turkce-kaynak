import {BaseHandler} from "./base-handler";
import {Image} from "./image";

// Herhangi bir tipteki dosyayı dönüştüren sınıf.
// UML diyagramındaki ConcreteHandler sınıfına denk gelmektedir.
export class CustomHandler extends BaseHandler {
  public handleRequest(image: Image): void {
    if(image.extension === 'OtherExtension') {
      console.log('OtherExtension to PNG');
      // Herhangi bir tipteki dosyanın işlemine ait dönüştürme kodları işlemleri.
    }
    // Burada else ifadesi bulunmamaktadır bu da zincirin son halkası olduğu anlamına gelir.
  }
}
