import {Connection} from "./connection";

export class MysqlConnection extends Connection {
  async closeConnection(): Promise<boolean> {
    // MySQL veri tabanı bağlantısının açılması için
    // Gerekli operasyonel işlemler...
    return Promise.resolve(true);
  }

  async openConnection(): Promise<boolean> {
    // MySQL veri tabanı bağlantısının kapatılması için
    // Gerekli operasyonel işlemler...
    return Promise.resolve(true);
  }
}
