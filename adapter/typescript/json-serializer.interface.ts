// UML diyagramındaki Target'a denk gelmektedir.
// Sistem bu arayüzü uygulayarak çalışmaktadır.
export interface IJsonSerializer<T extends object = object> {
  serializeObject(obj: T): string;
}
