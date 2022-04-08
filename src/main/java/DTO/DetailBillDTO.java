/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author mizuk
 */
public class DetailBillDTO{
    private String food_name;
    private int price;
    private int food_count;
    private int total_price;
     
    public DetailBillDTO(){}
    
    public  DetailBillDTO(String food_name, int price, int food_count,int total_price){
        setFood_name(food_name);
        setPrice(price);
        setFood_count(food_count);
    }

    public int getTotal_price() {
        return getPrice()*getFood_count();
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFood_count() {
        return food_count;
    }

    public void setFood_count(int food_count) {
        this.food_count = food_count;
    }
}
