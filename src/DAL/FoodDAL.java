/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.BillInfoDTO;
import java.util.List;
import DTO.FoodDTO;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author mizuk
 */
public class FoodDAL {
    List <FoodDTO> listFood = new ArrayList<FoodDTO>();
    List <FoodDTO> listFoodName = new ArrayList<FoodDTO>();
    public void getDataFromMySql(){
        ResultSet rs = null;
        try{
            String query = "SELECT * FROM `food` ORDER BY food_id ASC";
            
            rs = DataProvider.resultset(query, true);
            while(rs.next()){
                listFood.add(new FoodDTO(
                    rs.getInt("food_id"),
                    rs.getString("food_name"),
                    rs.getInt("category_id")
                ));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }        
    }
    public void getFoodNameFromCategoryId(int category_id){
        ResultSet rs = null;
        try{
            String query = "SELECT * FROM `food` WHERE category_id = "+category_id;
            
            rs = DataProvider.resultset(query, true);
            while(rs.next()){
                listFoodName.add(new FoodDTO(
                    rs.getString("food_name")
                ));
            }
        }catch(SQLException e){
            e.printStackTrace();
        } 
    }
    public void loadFoodToCombobox(JComboBox<String> cbxFood){
        while(cbxFood.getItemCount() > 0){
            cbxFood.removeItemAt(0);
        }
        for (FoodDTO foodDTO : listFoodName) {
            cbxFood.addItem(foodDTO.getFood_name());
        }
    }

}
