import Entity.Factory.Database;
import Entity.Factory.DatabaseFactory;

public class BT1Factory {
    public static void main(String[] args) {
        Database mysql = DatabaseFactory.getDatabase("mysql");
        mysql.connect();

        Database postgresql = DatabaseFactory.getDatabase("postgresql");
        postgresql.connect();
    }
}
