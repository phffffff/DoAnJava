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
    
    public List<MonAnDTO> getData(){
        try{
            String query = "SELECT * FROM `mon_an` ORDER BY ma_mon ASC";
            
            ResultSet rs =  DataProvider.connect(query, true);
            while(rs.next()){
                listFood.add(new MonAnDTO(
                    rs.getString("ma_mon"),
                    rs.getString("ten_mon"),
                    rs.getInt("so_luong"),
                    rs.getInt("gia")                        
                ));
            }
            return listFood;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }        
    }
//    public void addData(String []arr, int ma_quyen){
//        String query = "INSERT INTO `mon_an`(`ma_mon`, `ten_mon`, `loai`, `so_luong`, `gia`) "
//                + "VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]')";
//        
//        DataProvider.connect(query, false);
//    }
//    public void delData(int ma_tai_khoan){
//        String query = "DELETE FROM `tai_khoan` WHERE `ma_tai_khoan` = "+ma_tai_khoan;
//        DataProvider.connect(query, false);
//    }
//    public void updateData(int []arr_num, String []arr){
//        String query = "UPDATE `tai_khoan` SET `ten_tai_khoan` = '"+arr[0]+"' AND `ten_hien_thi` = '"+arr[1]+"' "
//                + "AND `"+arr[2]+"` AND `phan_quyen` = '"+arr_num[1]+"' WHERE `ma_tai_khoan` = "+arr_num[0];
//        DataProvider.connect(query, false);
//    }
//    public void getFoodNameFromCategoryId(int ma_loai){
//        try{
//            String query = "SELECT * FROM `mon_an` WHERE loai = "+ma_loai;
//            
//            ResultSet rs =  DataProvider.connect(query, true);
//            while(rs.next()){
//                listFoodName.add(new MonAnDTO(
//                    rs.getString("ten_mon")
//                ));
//            }
//        }catch(SQLException e){
//            e.printStackTrace();
//        } 
//    }
//    public void loadFoodToCombobox(JComboBox<String> cbxFood){
//        while(cbxFood.getItemCount() > 0){
//            cbxFood.removeItemAt(0);
//        }
//        for (MonAnDTO monAnDTO : listFoodName) {
//            cbxFood.addItem(monAnDTO.getTen_mon());
//        }
//    }

}
