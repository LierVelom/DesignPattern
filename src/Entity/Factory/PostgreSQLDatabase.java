package Entity.Factory;

public class PostgreSQLDatabase implements Database {
    public void connect() {
        System.out.println("Connected to PostgreSQL Database.");
    }
}
