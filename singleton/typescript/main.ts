import {Database} from "./database";

function main() {
  const firstInstanceRequest = Database.getInstance();
  const secondInstanceRequest = Database.getInstance();

  const isEquals = firstInstanceRequest === secondInstanceRequest;

  console.log(`Database reference is equals: ${isEquals}`);
  //output: Database reference is equals: True
}
