import {IJsonSerializer} from "./json-serializer.interface";
import {CustomSerializer} from "./custom-serializer";

// Daha sonradan dahil edilen yapının sisteme adepte edilmesi işlemi.
// Sistemin kullandığı arayüzü uygular.
// Bu sayede IJsonSerializer'i uygulayan bir sınıf örneği istendiğinde
// bu sınıf örneğini vererek mevcut koda dokunmadan sistemin devam etmesi
// sağlanır.
// UML diyagramındaki Adapter'a denk gelmektedir.
export class CustomSerializerAdapter implements  IJsonSerializer {
  serializeObject(obj: object): string {
    const customSerializer = new CustomSerializer();
    return customSerializer.serialize(obj);
  }
}
