import Entity.Singleton.DatabaseConnectionSingleton;

public class Singleton {

    public static void main(String[] args) {
        DatabaseConnectionSingleton dbConnection1 = DatabaseConnectionSingleton.getInstance();
        dbConnection1.connect();

        DatabaseConnectionSingleton dbConnection2 = DatabaseConnectionSingleton.getInstance();
        System.out.println(dbConnection1 == dbConnection2);
    }

}
