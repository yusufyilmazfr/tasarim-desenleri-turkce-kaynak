export abstract class Connection {
  public abstract openConnection(): Promise<boolean>;
  public abstract closeConnection(): Promise<boolean>;
}
