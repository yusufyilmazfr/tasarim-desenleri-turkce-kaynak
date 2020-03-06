package AbstractFactory;

public class OracleConnection extends Connection {
    @Override
    public Boolean openConnection() {
        // Oracle veri tabanı bağlantısının açılması için
        // Gerekli operasyonel işlemler...

        return true;
    }

    @Override
    public Boolean closeConnection() {
        // Oracle veri tabanı bağlantısının kapatılması için
        // Gerekli operasyonel işlemler...

        return true;
    }
}
