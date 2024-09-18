/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.model;

import edu.db.DBConnection;
import edu.dto.ItemDto;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author DILSHAN HESARA
 */
public class ItemModel {
    
    public ArrayList<ItemDto> getAll() throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Item";
        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet rst = statement.executeQuery();
        ArrayList<ItemDto> itemDtos = new ArrayList<>();

        while(rst.next()){
            ItemDto itemDto = new ItemDto();
            itemDto.setItemCode(rst.getString("ItemCode"));
            itemDto.setDescription(rst.getString("Description"));
            itemDto.setPackSize(rst.getString("PackSize"));
            itemDto.setUnitPrice(rst.getDouble("UnitPrice"));
            itemDto.setQoh(rst.getInt("QtyOnHand"));

            itemDtos.add(itemDto);
        }
        return itemDtos;
    }
    
     public ItemDto getItem(String itemCode) throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Item WHERE ItemCode = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, itemCode);

        ResultSet rst = statement.executeQuery();

        if(rst.next()){
            ItemDto itemDto = new ItemDto();
            itemDto.setItemCode(rst.getString("ItemCode"));
            itemDto.setDescription(rst.getString("Description"));
            itemDto.setPackSize(rst.getString("PackSize"));
            itemDto.setUnitPrice(rst.getDouble("UnitPrice"));
            itemDto.setQoh(rst.getInt("QtyOnHand"));

            return itemDto;
        }
        return null;
    }
    
    
    
    
    
    
    
    
    
    
}
