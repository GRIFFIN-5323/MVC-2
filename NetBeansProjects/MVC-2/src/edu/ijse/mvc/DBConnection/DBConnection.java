/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.DBConnection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author gihan5323
 */
public class DBConnection {
    
    private static DBConnection dbconnection;
        private Connection connection;
    
    private DBConnection()throws ClassNotFoundException,SQLException{
            Class.forName("com.mysql.cj.jdbc.Driver");
             connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Supermarket","root","mysql");

 

    }
            
    
    

    
    
    public static DBConnection getInstance()throws ClassNotFoundException,SQLException{
        if(dbconnection==null){
            dbconnection=new DBConnection();
        }
        
        return dbconnection;
        
    }
    
    public Connection getConnection(){
        return this.connection;
    }
    
    
    
}
