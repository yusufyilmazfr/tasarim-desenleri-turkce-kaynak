import {Connection} from "./connection";

export class OracleConnection extends Connection {
  public closeConnection(): boolean {
    // Oracle veri tabanı bağlantısının açılması için
    // Gerekli operasyonel işlemler...
    return true;
  }

  public openConnection(): boolean {
    // Oracle veri tabanı bağlantısının kapatılması için
    // Gerekli operasyonel işlemler...
    return true;
  }
}
