/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.controller;

import edu.dto.OrderDto;
import edu.model.OrderModel;
/**
 *
 * @author DILSHAN HESARA
 */
public class OrderController {
    
      private OrderModel orderModel = new OrderModel();
    
    public String placeOrder(OrderDto orderDto) throws Exception{
        String resp = orderModel.placeOrder(orderDto);
        return resp;
    }
}
