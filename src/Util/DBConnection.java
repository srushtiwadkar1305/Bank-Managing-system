package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/bankdb"
                                    + "?useSSL=false"
                                    + "&serverTimezone=UTC"
                                    + "&allowPublicKeyRetrieval=true"
                                    + "&usePublicKeyRetrieval=true"
                                    + "&auth-type=mysql_native_password";

    private static final String USER     = "root";
    private static final String PASSWORD = "Your Password";

    private static Connection connection = null;

    private DBConnection() {}

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("✓ Database connected successfully!");
            }

        } catch (ClassNotFoundException ex) {
            System.err.println("✗ MySQL Driver not found!");
            JOptionPane.showMessageDialog(null,
                "MySQL Driver not found!\n" +
                "Add mysql-connector-j.jar to Build Path");

        } catch (java.sql.SQLException ex) {
            System.err.println("✗ Connection failed: " + ex.getMessage());
            System.err.println("  Error Code: " + ex.getErrorCode());

            if (ex.getErrorCode() == 1045) {
                JOptionPane.showMessageDialog(null,
                    "Wrong MySQL password!\n" +
                    "Check PASSWORD in DBConnection.java");
            } else if (ex.getErrorCode() == 1049) {
                JOptionPane.showMessageDialog(null,
                    "Database 'bankdb' not found!\n" +
                    "Run CREATE DATABASE bankdb in MySQL Workbench");
            } else {
                JOptionPane.showMessageDialog(null,
                    "Database Error " + ex.getErrorCode() + ":\n" +
                    ex.getMessage());
            }
        }
        return connection;
    }
}