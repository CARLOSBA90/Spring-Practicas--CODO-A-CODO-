package data;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbManager {


    public DbManager() {  }  

    public static Connection execute() throws IOException, ClassNotFoundException, SQLException {  
    	String url = "jdbc:mysql://localhost:3306/cac";
    	String user = "root";
    	String pass = "";
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        
          return DriverManager.getConnection(url,user,pass);  
    }  
}
