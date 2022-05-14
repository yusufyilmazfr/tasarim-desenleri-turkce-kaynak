import {Image} from "./image";

// Zincirin bir sonraki halkasının tanımlandığı sınıftır.
// İşlemi gerçekleştirecek olan metot tanımı bulunur.
// UML diyagramındaki BaseHandler sınıfına denk gelmektedir.
export abstract class BaseHandler {
  protected nextHandler: BaseHandler;

  public setNextHandler(nextHandler: BaseHandler): void {
    this.nextHandler = nextHandler;
  }

  public abstract handleRequest(image: Image): void;
}
