import {IDataSource} from "./data-source.interface";

// UML diyagramındaki Component (IDataSource) arayüzünü uygular.
// Constructor sayesinde özellikleri değiştirilmesi istenen nesnenin referansı tutulur.
// Bu sınıftan türeyen sınıfların uygulamasını, değiştirilmesini istediğimiz metotları abstract anahtar kelimesi ile işaretledik.
// UML diyagramındaki BaseDecorator yapısına denk gelmektedir.
export abstract class BaseDataSourceDecorator implements IDataSource {
  protected constructor(protected readonly dataSource: IDataSource) {}

  abstract getFileName(): string;

  abstract readData(): void;

  abstract writeData(data: object): void
}
