export abstract class Command {
  public abstract executeCommand(query: string): void
}
