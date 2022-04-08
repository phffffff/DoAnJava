/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author mizuk
 */
public class FoodDTO {
    private int food_id;
    private String food_name;
    private int category_id;
    
    public  FoodDTO(int food_id, String food_name){
        setFood_id(food_id);
        setFood_name(food_name);
    }
    public  FoodDTO(String food_name){
        setFood_name(food_name);
    }
    
    public  FoodDTO(int food_id, String food_name, int category_id){
        setFood_id(food_id);
        setFood_name(food_name);
        setCategory_id(category_id);
    }
    
    public int getFood_id() {
        return food_id;
    }

    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
    
}
