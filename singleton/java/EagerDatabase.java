package Singleton;
public class EagerDatabase {
    public static final EagerDatabase INSTANCE = new EagerDatabase();
    private EagerDatabase(){}
}
