package Singleton;

public class Database {
    private static Database database;
	private static Object _synchronizedObject = new Object();
    
	private Database() {

    }

    public static Database getInstance() {
        if (database == null) {
            
            synchronized (_synchronizedObject) {
                if (database == null) {
                    database = new Database();
                }
            }
        }
        return database;
    }
}