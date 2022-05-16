import {Connection} from "./connection";
import {Command} from "./command";

export interface IDatabaseFactory {
  createConnection(): Connection;
  createCommand(): Command;
}
