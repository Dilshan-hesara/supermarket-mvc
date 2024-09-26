/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.dto;

import java.util.ArrayList;

/**
 *
 * @author DILSHAN HESARA
 */
public class OrderDto {
    private String orderId;
    private String orderDate;
    private String custId;
    
    private ArrayList<OrderDetailDto> orderDetailDtos;

    public OrderDto() {
    }

    public OrderDto(String orderId, String orderDate, String custId, ArrayList<OrderDetailDto> orderDetailDtos) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.custId = custId;
        this.orderDetailDtos = orderDetailDtos;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public ArrayList<OrderDetailDto> getOrderDetailDtos() {
        return orderDetailDtos;
    }

    public void setOrderDetailDtos(ArrayList<OrderDetailDto> orderDetailDtos) {
        this.orderDetailDtos = orderDetailDtos;
    }

    @Override
    public String toString() {
        return "OrderDto{" + "orderId=" + orderId + ", orderDate=" + orderDate + ", custId=" + custId + ", orderDetailDtos=" + orderDetailDtos + '}';
    }

    
}
