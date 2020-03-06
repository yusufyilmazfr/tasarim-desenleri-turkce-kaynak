package AbstractFactory;

// MySQL için ilişkili nesneler üretildi.
public class MySQLDatabaseFactory implements IDatabaseFactory {
    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }

    @Override
    public Command createCommand() {
        return new MySQLCommand();
    }
}
