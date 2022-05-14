import {CustomOperation} from "./custom-operation";
import {OracleDatabaseFactory} from "./oracle-database-factory";

async function main() {
  const customOperation = new CustomOperation(new OracleDatabaseFactory());
  await customOperation.removeById(1);

  console.log('Hello World!');
}
