import {IDatabaseFactory} from "./database-factory.interface";
import {Command} from "./command";
import {Connection} from "./connection";
import {OracleCommand} from "./oracle-command";
import {OracleConnection} from "./oracle-connection";

// Oracle için ilişkili nesneler üretildi.
export class OracleDatabaseFactory implements IDatabaseFactory{
  createCommand(): Command {
    return new OracleCommand();
  }

  createConnection(): Connection {
    return new OracleConnection();
  }
}
