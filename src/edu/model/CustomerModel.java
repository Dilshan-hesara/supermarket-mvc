/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.model;
import edu.db.DBConnection;
import edu.dto.CustomerDto;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author DILSHAN HESARA
 */
public class CustomerModel {
    
    public String save(CustomerDto dto) throws SQLException, ClassNotFoundException {
    Connection connection = DBConnection.getInstance().getConnection();
    String sql = "INSERT INTO customer VALUES (?,?,?,?,?,?,?,?,?)";
    PreparedStatement statement = connection.prepareStatement(sql);
    
    statement.setString(1, dto.getCustID());
    statement.setString(2, dto.getCustTitle());
    statement.setString(3, dto.getName());
    statement.setString(4, dto.getDOB());
    statement.setDouble(5, dto.getSalary());
    statement.setString(6, dto.getCitiy());
    statement.setString(7, dto.getProvince());
    statement.setString(8, dto.getAddress());
    statement.setString(9, dto.getPostcode());

    int resp = statement.executeUpdate();
    return resp > 0 ? "Success" : "Fail";
}
    
}
