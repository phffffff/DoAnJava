package DAL;
import DTO.LoaiMonDTO;
import DataProvider.*;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mizuk
 */
public class LoaiMonDAL {
    List <LoaiMonDTO> listCategory = new ArrayList<LoaiMonDTO>();
    List <LoaiMonDTO> listCategoryName = new ArrayList<LoaiMonDTO>();
    
    public List<LoaiMonDTO> getData(){
        try{
            String query = "SELECT * FROM `loai_thuc_an` ORDER BY ma_loai ASC";
            
            ResultSet rs =  DataProvider.connect(query, true);
            while(rs.next()){
                listCategory.add(new LoaiMonDTO(
                    rs.getString("ma_loai"),
                    rs.getString("ten_loai")
                ));
            }
            return listCategory;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }    
    }
    public void addData(String []arr){
        String query = "INSERT INTO `loai_thuc_an`(`ma_loai`, `ten_loai`) VALUES ('"+arr[0]+"','"+arr[1]+"')";
        DataProvider.connect(query, false);
    }
    public void delData(String ma_loai){
        String query = "DELETE FROM `loai_thuc_an` WHERE `ma_loai` = '"+ma_loai+"'";
        DataProvider.connect(query, false);
    }
    public void updateData(String []arr){
        String query = "UPDATE `loai_thuc_an` SET `ten_loai`='"+arr[0]+"' WHERE `ma_loai` = '"+arr[1]+"'";
        DataProvider.connect(query, false);
    }
}
