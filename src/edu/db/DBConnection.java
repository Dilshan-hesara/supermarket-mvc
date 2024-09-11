/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DILSHAN HESARA
 */
public class DBConnection {
    private static DBConnection  dBConnection; // 1 

    private Connection connection;  //3

    private DBConnection() throws SQLException, ClassNotFoundException{ //4 conntion ekk hadanava
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Supermarket", "root", "18091479");
    }

    public static DBConnection getInstance() throws SQLException, ClassNotFoundException{ //2 object return 1n time tamlate 
        if(dBConnection == null){
            dBConnection = new DBConnection();
        }
        return dBConnection;
    }

    public Connection getConnection(){ //contion return
        return connection;
    }    
}
