/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.controller;


import edu.dto.ItemDto;
import edu.model.ItemModel;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author DILSHAN HESARA
 */
public class ItemController {
   
    
       private final ItemModel ITEM_MODEL;

    public ItemController() {
        this.ITEM_MODEL = new ItemModel();
    }

    public ArrayList<ItemDto> getAllItems() throws SQLException, ClassNotFoundException{
        ArrayList<ItemDto> itemDtos = ITEM_MODEL.getAll();
        return itemDtos;
    }
    
        public ItemDto searchItem(String itemCode) throws SQLException, ClassNotFoundException{
        ItemDto dto = ITEM_MODEL.getItem(itemCode);
        return dto;
    }
    
    
    
    
    
    
    
    
    
    
}
