/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import java.sql.*;

/**
 *
 * @author INTER-TECH
 */
public class DBConnection {
   
    static final String DB_URL = "jdbc:mysql://localhost/Library";
     static final String USER = "root";
      static final String PASS = "root";
    public static Connection connectDB(){
         Connection conn = null;
        try{
            //register jdbc driver, not required for newer versions
        Class.forName("com.mysql.jdbc.Driver");
        //open a connection
        conn = DriverManager.getConnection(DB_URL,USER,PASS);
        return conn;
        }catch(Exception ex){
        System.out.println("There were errors conecting to DB");
        return null;
       }
    }
}
