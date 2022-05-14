// Uygulama süresince resimlerimizi temsil edecek sınıf.
export class Image {
  public name: string;
  public extension: string;

  constructor(name: string, extension: string) {
    this.name = name;
    this.extension = extension;
  }
}
