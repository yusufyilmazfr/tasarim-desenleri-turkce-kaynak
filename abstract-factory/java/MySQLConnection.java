package AbstractFactory;

public class MySQLConnection extends Connection {
    @Override
    public Boolean openConnection() {
        // MySQL veri tabanı bağlantısının açılması için
        // Gerekli operasyonel işlemler...
        return true;
    }

    @Override
    public Boolean closeConnection() {
        // MySQL veri tabanı bağlantısının kapatılması için
        // Gerekli operasyonel işlemler...
        return true;
    }
}
