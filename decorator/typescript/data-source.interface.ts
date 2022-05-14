// Üst sınıfların uygulayacağı arayüzdür.
// Yapılacak temel işlemler tanımlanmıştır.
// UML diyagramındaki Component arayüzüne denk gelmektedir.
export interface IDataSource {
  getFileName(): string;
  writeData(data: object): void;
  readData(): void;
}
