/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author smsak
 */
public class DBconnection {
    String url = "jdbc:mysql://localhost:3306/lms";   // Database URL
    String user = "root";   // Database root password = root.
    String pass = "";       // Database default root password = ""
    
    
    
    public Connection getConnect() throws SQLException{
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return con;
    }
}
