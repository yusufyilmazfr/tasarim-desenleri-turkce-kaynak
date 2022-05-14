import {Employee} from "./employee";

function main() {
  const gulizar = new Employee("Gülizar", "Yılmaz");
  const cloneGulizar = gulizar.clone();

  // Aynı nesne örneklerini farklı referanslarda tutuyor.
  // Birbirinin aynısı ve farklı referanslarda olan nesneler elde ettik.
  console.log(gulizar === cloneGulizar);
}
