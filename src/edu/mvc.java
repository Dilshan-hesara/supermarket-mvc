/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu;

import edu.db.DBConnection;
import edu.view.CustomerView;

import java.sql.SQLException;


/**
 *
 * @author DILSHAN HESARA
 */
public class mvc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
          System.out.println("Hello");
        DBConnection.getInstance().getConnection();
        new CustomerView().setVisible(true);
    }
    }
    

