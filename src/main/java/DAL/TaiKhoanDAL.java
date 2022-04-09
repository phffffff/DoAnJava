/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;
import DTO.*;
import DataProvider.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author mizuk
 */
public class TaiKhoanDAL {
    List <TaiKhoanDTO> listAccount = new ArrayList <TaiKhoanDTO>();
    public void getDataFromMySql(){
        try{
            String query = "SELECT * FROM `tai_khoan`";
            
            ResultSet rs = DataProvider.connect(query, true);
            
            while(rs.next()){
                TaiKhoanDTO data = new TaiKhoanDTO(
                    rs.getInt("ma_tai_khoan"),
                    rs.getString("ten_tai_khoan"),
                    rs.getString("ten_hien_thi"),
                    rs.getString("mat_khau"),
                    rs.getInt("phan_quyen")
                );
                listAccount.add(data);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void loadDataToTablelist(DefaultTableModel model){
        while(model.getRowCount() > 0){
            model.removeRow(0);
        }
        for (TaiKhoanDTO accountDTO : listAccount) {
            model.addRow(new Object[]{accountDTO.getMa_tai_khoan(),accountDTO.getTen_tai_khoan(),accountDTO.getTen_hien_thi(),accountDTO.getMat_khau(),accountDTO.getPhan_quyen()});
        }
        model.fireTableDataChanged();
    }
    public boolean login(String username, String password){
        try{
            String query = "SELECT * FROM `tai_khoan` WHERE ten_tai_khoan = '"+username+"' AND mat_khau = '"+password+"'";
            
            ResultSet rs =  DataProvider.connect(query, true);
            
            if(rs.next()){
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
