import {IDataSource} from "./data-source.interface";

// Temel işlemlerin tanımlandığı IDataSource arayüzünü uygulayan sınıftır.
// UML diyagramındaki ConcreteComponent sınıfına denk gelmektedir.
export class FileDataSource implements IDataSource {
  private readonly fileName: string;

  constructor(fileName: string) {
    this.fileName = fileName;
  }

  getFileName(): string {
    return this.fileName;
  }

  readData(): void {
    console.log(`${this.fileName} readed.`);
  }

  writeData(data: object): void {
    console.log(`Data was written to ${this.fileName}`);
  }
}
