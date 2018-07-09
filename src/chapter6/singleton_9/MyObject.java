package chapter6.singleton_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author spencercjh
 */
public enum MyObject {
    connectionFactory;
    private Connection connection;

    private MyObject() {
        try {
            System.out.println("myObject构造函数被调用");
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
