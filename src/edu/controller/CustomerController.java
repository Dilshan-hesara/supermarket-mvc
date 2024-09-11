/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.controller;

import edu.dto.CustomerDto;
import edu.model.CustomerModel;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author DILSHAN HESARA
 */
public class CustomerController {
    
         private final CustomerModel CUSTOMER_MODEL;

  public  CustomerController() {
        this.CUSTOMER_MODEL = new CustomerModel();
    }
  
  public String saveCustomer(CustomerDto cutomerDto) throws SQLException, ClassNotFoundException{
        String resp = CUSTOMER_MODEL.save(cutomerDto);
        return resp;
    }
  
  public String deleteCustomer(String CustID) throws Exception {
        String resp = CUSTOMER_MODEL.delete(CustID);
        return resp;
    }
  
   public CustomerDto searchCustomer(String custId ) throws SQLException, ClassNotFoundException{
        CustomerDto dto = CUSTOMER_MODEL.search(custId);
        return dto;
    }
   
   public List<CustomerDto> getAllcustomer() throws SQLException, ClassNotFoundException{
        List<CustomerDto> customerDtos = CUSTOMER_MODEL.getAll();
        return customerDtos;
    }

}
