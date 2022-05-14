import {Encyclopedia} from "./encyclopedia";
import {Magazine} from "./magazine";
import {XmlExportVisitor} from "./xml-export-visitor";
import {JsonExportVisitor} from "./json-export-visitor";

function main() {
  const earth = new Encyclopedia();
  earth.name = 'Big Earth!';
  earth.author = 'Jose S. Massey';
  earth.categoryName = 'Encyclopedia';

  const daily = new Magazine();
  daily.name = 'Daily Magazine';
  daily.author = 'Wayne D. Eaking';
  daily.categoryName = 'Magazine';

  const xmlExportVisitor = new XmlExportVisitor();
  const jsonExportVisitor = new JsonExportVisitor();

  earth.accept(xmlExportVisitor);
  daily.accept(jsonExportVisitor);
  // output:
  //  Big Earth!exported by XmlExportVisitor
  //  Daily Magazine exported by JsonExportVisitor
}
