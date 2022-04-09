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
public class LoaiMonDAL {
    List <LoaiMonDTO> listCategory = new ArrayList<LoaiMonDTO>();
    
    public void getDataFromMySql(){
        try{
            String query = "SELECT * FROM `loai_thuc_an` ORDER BY ma_loai ASC;";
            
            ResultSet rs = DataProvider.connect(query, true);
            while(rs.next()){
                listCategory.add(new LoaiMonDTO(
                        rs.getInt("ma_loai"),
                        rs.getString("ten_loai")
                ));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void loadListCategoryToCombobox(JComboBox<String> cbxCategory){
        while(cbxCategory.getItemCount() > 0){
            cbxCategory.removeItemAt(0);
        }
        for (LoaiMonDTO loaiMonDTO : listCategory) {
            cbxCategory.addItem(loaiMonDTO.getTen_loai());
        }
    }
}
