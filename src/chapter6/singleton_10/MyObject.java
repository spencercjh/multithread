package chapter6.singleton_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author spencercjh
 */
public class MyObject {
    private enum MyEnumSingleton {
        connectionFactory;
        private Connection connection;

        private MyEnumSingleton() {
            try {
                System.out.println("创建MyObject对象");
                String url = "jdbc:sqlsever://localhost:1079;databaseName=ghydb";
                String username = "sa";
                String password = "";
                String driverName = "com.microsoft.sqlsever.jdbc.SQLSeverDriver";
                Class.forName(driverName);
                connection = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

        public Connection getConnection() {
            return connection;
        }

    }

    public static Connection getConnection() {
        return MyEnumSingleton.connectionFactory.getConnection();
    }

}
