import {Connection} from "./connection";
import {Command} from "./command";
import {IDatabaseFactory} from "./database-factory.interface";

export class CustomOperation<T extends IDatabaseFactory> {
  private connection: Connection;
  private command: Command;

  constructor(private readonly databaseFactory: T) {
    this.connection = databaseFactory.createConnection();
    this.command = databaseFactory.createCommand();
  }

  public removeById(id: number): void {
    this.connection.openConnection();
    this.command.executeCommand('DELETE ...');
    this.connection.closeConnection();
  }
}
