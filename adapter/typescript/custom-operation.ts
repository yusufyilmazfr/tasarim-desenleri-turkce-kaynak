import {IJsonSerializer} from "./json-serializer.interface";

export class CustomOperation {
  constructor(private readonly jsonSerializer: IJsonSerializer) {}

  public serializeObject(obj: object): string {
    return this.jsonSerializer.serializeObject(obj);
  }
}
