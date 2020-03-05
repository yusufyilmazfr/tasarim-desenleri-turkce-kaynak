package Singleton;

public class Database {
    private static Database database;

    private Database() {

    }

    public static Database getInstance() {
        if (database == null) {
            Object synchronizedObject = new Object();

            synchronized (synchronizedObject) {
                if (database == null) {
                    database = new Database();
                }
            }
        }
        return database;
    }
}