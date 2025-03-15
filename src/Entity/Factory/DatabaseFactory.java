package Entity.Factory;

public class DatabaseFactory {
    public static Database getDatabase(String type) {
        if (type.equalsIgnoreCase("mysql")) {
            return new MySQLDatabase();
        } else if (type.equalsIgnoreCase("postgresql")) {
            return new PostgreSQLDatabase();
        }
        return null;
    }
}