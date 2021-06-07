package Smoothstack;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JBWK1_A6 {
    
    public static class SampleSingleton {

        private static Connection conn = null;

        private static volatile SampleSingleton instance = null;
        
        private SampleSingleton() {}

        public static SampleSingleton getInstance() {
            if (instance == null) 
                synchronized(SampleSingleton.class) {
                    if (instance == null) {
                        instance = new SampleSingleton();
                    }
                }

            return instance;
        }
    }

    // public class DatabaseConnection {
        
    //     private static Connection con = null;

    //     static {
    //         String url = "jdbc:mysql:// localhost:3306/org";
    //         String user = "root";
    //         String pass = "root";

    //         try {
    //             Class.forName("com.mysql.jdbc.Driver");
    //             con = DriverManager.getConnection(url, user, pass);
    //         }
    //         catch (ClassNotFoundException | SQLException e) {
    //             e.printStackTrace();
    //         }
    //     }
    //     public static Connection getConnection() {
    //         return con;
    //     }
    // }
}


