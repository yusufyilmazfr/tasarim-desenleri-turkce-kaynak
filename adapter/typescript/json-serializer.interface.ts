export interface IJsonSerializer<T extends object = object> {
  // UML diyagramındaki Target'a denk gelmektedir.
  // Sistem bu arayüzü uygulayarak çalışmaktadır.
  serializeObject(obj: T): string;
}
