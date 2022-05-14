import {CustomOperation} from "./custom-operation";
import {CustomSerializerAdapter} from "./custom-serializer-adapter";

function main(): void {
  const customOperation = new CustomOperation(new CustomSerializerAdapter());
  const serializedObject = customOperation.serializeObject({hello: 'World!'});

  console.log(serializedObject);
}
