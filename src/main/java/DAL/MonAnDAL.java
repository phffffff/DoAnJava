/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.*;
import DataProvider.*;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author mizuk
 */
public class MonAnDAL {
    List <MonAnDTO> listFood = new ArrayList<MonAnDTO>();
    List <MonAnDTO> listFoodName = new ArrayList<MonAnDTO>();
    public void getDataFromMySql(){
        try{
            String query = "SELECT * FROM `mon_an` ORDER BY ma_mon ASC";
            
            ResultSet rs =  DataProvider.connect(query, true);
            while(rs.next()){
                listFood.add(new MonAnDTO(
                    rs.getInt("ma_mon"),
                    rs.getString("ten_mon"),
                    rs.getInt("loai"),
                    rs.getInt("so_luong"),
                    rs.getInt("gia")                        
                ));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }        
    }
    public void getFoodNameFromCategoryId(int ma_loai){
        try{
            String query = "SELECT * FROM `mon_an` WHERE loai = "+ma_loai;
            
            ResultSet rs =  DataProvider.connect(query, true);
            while(rs.next()){
                listFoodName.add(new MonAnDTO(
                    rs.getString("ten_mon")
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
        for (MonAnDTO monAnDTO : listFoodName) {
            cbxFood.addItem(monAnDTO.getTen_mon());
        }
    }

}
