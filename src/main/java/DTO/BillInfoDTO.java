/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author mizuk
 */
public class BillInfoDTO {
    private int bill_info_id;
    private int bill_id;
    private int food_id;
    private int count_food;
    
    public BillInfoDTO(){}
    
    public BillInfoDTO(int bill_info_id, int bill_id, int food_id, int count_food){
        setBill_info_id(bill_info_id);
        setBill_id(bill_id);
        setFood_id(food_id);
        setCount_food(count_food);
    }
    
    public int getBill_info_id() {
        return bill_info_id;
    }

    public void setBill_info_id(int bill_info_id) {
        this.bill_info_id = bill_info_id;
    }

    public int getBill_id() {
        return bill_id;
    }

    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    public int getFood_id() {
        return food_id;
    }

    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }

    public int getCount_food() {
        return count_food;
    }

    public void setCount_food(int count_food) {
        this.count_food = count_food;
    }
    
}
