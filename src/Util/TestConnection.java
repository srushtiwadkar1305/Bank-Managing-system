package Util;

import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {

        System.out.println("Testing database connection...");
        System.out.println("URL      : jdbc:mysql://localhost:3306/bankdb");
        System.out.println("User     : root");
        System.out.println("-------------------------------------------");

        Connection conn = DBConnection.getConnection();

        if (conn != null) {
            System.out.println("-------------------------------------------");
            System.out.println("RESULT: SUCCESS - Ready to run the project!");
            System.out.println("-------------------------------------------");
        } else {
            System.out.println("-------------------------------------------");
            System.out.println("RESULT: FAILED - Read the error above");
            System.out.println("-------------------------------------------");
        }
    }
}