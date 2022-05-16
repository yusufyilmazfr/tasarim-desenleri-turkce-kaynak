export abstract class Connection {
  public abstract openConnection(): boolean;
  public abstract closeConnection(): boolean;
}
