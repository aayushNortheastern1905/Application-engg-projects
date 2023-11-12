/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ronak
 */
public class Order {
    
    ArrayList<OrderItem> orderItemList;

    public Order() {
        
        this.orderItemList = new ArrayList<OrderItem>();
        
        
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    
    public void addNewOrderItem(Product product, double price, int quantity){
        OrderItem orderItem = new OrderItem(product, price, quantity);
        orderItemList.add(orderItem);
    }
    
    public void deleteItem(OrderItem item){
        this.orderItemList.remove(item);
    }
    
    public OrderItem findProduct(Product product){
        for(OrderItem io: this.getOrderItemList()){
            if(io.getProduct().equals(product)){
                return io;
            }
        }
        return null;
    }
}
