package AbstractFactory;

public class CustomOperation {
    IDatabaseFactory databaseFactory;
    Connection connection;
    Command command;

    public CustomOperation(IDatabaseFactory databaseFactory) {
        this.databaseFactory = databaseFactory;
        this.command = databaseFactory.createCommand();
        this.connection = databaseFactory.createConnection();
    }

    public void removeById(int id) {
        connection.openConnection();
        command.executeCommand("DELETE ...");
        connection.closeConnection();
    }
}
