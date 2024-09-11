/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.model;
import edu.db.DBConnection;
import edu.dto.CustomerDto;
import java.util.List;
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
     public String delete(CustomerDto dto) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = " DELETE FROM customer WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, dto.getCustID());
        
        int resp = statement.executeUpdate();
        return resp > 0 ? "Succes" : "Fail";
}

    public String update(CustomerDto dto) throws SQLException, ClassNotFoundException {
    Connection connection = DBConnection.getInstance().getConnection();
    String sql =  "UPDATE customer SET CustID = ?, CustTitle = ?, CustName = ?, DOB = ?, Salary = ?, CustAddress = ?, City = ?, Province = ?, PostalCode = ? WHERE CustID = ?";

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
    return resp > 0 ? "update " : "Fail";
}

 public CustomerDto search(String custId) throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM customer WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, custId);

        ResultSet rst = statement.executeQuery();

        if(rst.next()){
            CustomerDto cusDto = new CustomerDto();
            cusDto.setCustID(rst.getString("CustID"));
            cusDto.setCustTitle(rst.getString("CustTitle"));
            cusDto.setName(rst.getString("CustName"));
            cusDto.setDOB(rst.getString("DOB"));
            cusDto.setSalary(rst.getDouble("salary"));
            cusDto.setAddress(rst.getString("CustAddress"));
            cusDto.setCitiy(rst.getString("City"));
            cusDto.setProvince(rst.getString("Province"));
            cusDto.setPostcode(rst.getString("PostalCode"));


    
            return cusDto;
        }
        return null;
    }

     public List<CustomerDto> getAllCustomer() throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Customer";
        PreparedStatement statement = connection.prepareStatement(sql);

         List<CustomerDto> customerDtos = new ArrayList<>();

        ResultSet rst = statement.executeQuery();


        while (rst.next()) {
            CustomerDto customerDto = new CustomerDto();
            
            customerDto.setCustID(rst.getString("CustID"));
            customerDto.setCustTitle(rst.getString("CustTitle"));
            customerDto.setName(rst.getString("CustName"));
            customerDto.setDOB(rst.getString("DOB"));
            customerDto.setSalary(rst.getDouble("salary"));
            customerDto.setCitiy(rst.getString("City"));
            customerDto.setProvince(rst.getString("Province"));
            customerDto.setAddress(rst.getString("CustAddress"));
            customerDto.setPostcode(rst.getString("PostalCode"));


             customerDtos.add(customerDto);
        }

        return customerDtos;


}

    public String delete(String CustID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<CustomerDto> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

