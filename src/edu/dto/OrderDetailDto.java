/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.dto;

/**
 *
 * @author DILSHAN HESARA
 */
public class OrderDetailDto {
       private String itemCode;
    private int qty;
    private double discount;

    public OrderDetailDto() {
    }

    public OrderDetailDto(String itemCode, int qty, double discount) {
        this.itemCode = itemCode;
        this.qty = qty;
        this.discount = discount;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OrderDetailDto{" + "itemCode=" + itemCode + ", qty=" + qty + ", discount=" + discount + '}';
    }
    
    
}
