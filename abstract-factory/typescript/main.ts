import {CustomOperation} from "./custom-operation";
import {OracleDatabaseFactory} from "./oracle-database-factory";

function main() {
  const customOperation = new CustomOperation(new OracleDatabaseFactory());
  customOperation.removeById(1);

  console.log('Hello World!');
}
