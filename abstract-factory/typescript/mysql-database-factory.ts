import {IDatabaseFactory} from "./database-factory.interface";
import {Command} from "./command";
import {Connection} from "./connection";
import {MysqlCommand} from "./mysql-command";
import {MysqlConnection} from "./mysql-connection";

// MySQL için ilişkili nesneler üretildi.
export class MysqlDatabaseFactory implements IDatabaseFactory{
  createCommand(): Command {
    return new MysqlCommand();
  }

  createConnection(): Connection {
    return new MysqlConnection();
  }
}
