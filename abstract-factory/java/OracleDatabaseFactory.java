package AbstractFactory;

// Oracle için ilişkili nesneler üretildi.
public class OracleDatabaseFactory implements IDatabaseFactory {
    @Override
    public Connection createConnection() {
        return new OracleConnection();
    }

    @Override
    public Command createCommand() {
        return new OracleCommand();
    }
}
