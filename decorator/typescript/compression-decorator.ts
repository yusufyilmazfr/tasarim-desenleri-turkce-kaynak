import {BaseDataSourceDecorator} from "./data-source-decorator";
import {IDataSource} from "./data-source.interface";

// Yeni davranışların tanımlandığı sınıftır.
// UML diyagramındaki BaseDecorator (BaseDataSourceDecorator) sınıfından türer.
// UML diyagramındaki ConcreteDecorator sınıfına denk gelmektedir.
export class CompressionDecorator extends BaseDataSourceDecorator {
  constructor(protected dataSource: IDataSource) {
    super(dataSource);
  }

  getFileName(): string {
    return this.dataSource.getFileName();
  }

  readData(): void {
    // Veriyi okurken referansını tuttuğumuz sınıfın kendi davranışını sergilemesini istiyoruz.
    this.dataSource.readData();
  }

  writeData(data: object): void {
    // Burada gelen veriye ait sıkıştırma işlemleri yapılacaktır.
    console.log('Data compressed.');

    // Sıkıştırma işlemleri yapıldıktan sonra yazma işlemleri gerçekleştirilecektir.
    console.log(`Compressed data was written to ${this.dataSource.getFileName()}`)
  }
}
