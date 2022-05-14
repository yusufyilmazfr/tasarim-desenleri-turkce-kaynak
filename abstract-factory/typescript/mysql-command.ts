import {Command} from "./command";

export class MysqlCommand extends Command {
  public async executeCommand(query: string): Promise<void> {
    // Gelen sorgunun çalıştırılması için
    // Gerekli operasyonel işlemler...
  }
}
