package Entity.Singleton;

public class DatabaseConnectionSingleton {
    private static DatabaseConnectionSingleton instance;

    private DatabaseConnectionSingleton() {
        System.out.println("Database Connection Created!");
    }

    public static DatabaseConnectionSingleton getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionSingleton();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to Database.");
    }
}
