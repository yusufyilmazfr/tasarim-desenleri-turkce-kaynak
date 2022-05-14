import {Connection} from "./connection";

export class OracleConnection extends Connection {
  async closeConnection(): Promise<boolean> {
    // Oracle veri tabanı bağlantısının açılması için
    // Gerekli operasyonel işlemler...
    return Promise.resolve(true);
  }

  async openConnection(): Promise<boolean> {
    // Oracle veri tabanı bağlantısının kapatılması için
    // Gerekli operasyonel işlemler...
    return Promise.resolve(true);
  }
}
