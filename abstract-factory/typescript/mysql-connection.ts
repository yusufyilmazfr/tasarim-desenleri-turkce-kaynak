import {Connection} from "./connection";

export class MysqlConnection extends Connection {
  public closeConnection(): boolean {
    // MySQL veri tabanı bağlantısının açılması için
    // Gerekli operasyonel işlemler...
    return true;
  }

  public openConnection(): boolean {
    // MySQL veri tabanı bağlantısının kapatılması için
    // Gerekli operasyonel işlemler...
    return true;
  }
}
