package Singleton;

public class App {
    public static void main(String[] args) {
        Database firstInstanceRequest = Database.getInstance();
        Database secondInstanceRequest = Database.getInstance();

        Boolean isEquals = firstInstanceRequest == secondInstanceRequest;

        System.out.printf("Database reference is equals: %b", isEquals); //output: Database reference is equals: true
    }
}