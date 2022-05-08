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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author mizuk
 */
public class TaiKhoanDAL {
    private List <TaiKhoanDTO> listTK = new ArrayList <TaiKhoanDTO>();
//    
//    public List <TaiKhoanDTO> getListAccount(){
//        return listAccount;
//    }
    public TaiKhoanDAL(){
    }

    public List<TaiKhoanDTO> getData(){
//        List <TaiKhoanDTO> sdsad = new ArrayList<>();
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
                listTK.add(data);
            }
            return listTK;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
//    public void loadDataToTablelist(DefaultTableModel model){
//        while(model.getRowCount() > 0){
//            model.removeRow(0);
//        }
//        for (TaiKhoanDTO accountDTO : listAccount) {
//            model.addRow(new Object[]{accountDTO.getMa_tai_khoan(),accountDTO.getTen_tai_khoan(),accountDTO.getTen_hien_thi(),accountDTO.getMat_khau(),accountDTO.getPhan_quyen()});
//        }
//        model.fireTableDataChanged();
//    }
//    public boolean getCountByString(String username, String password){
//        try{
//            String query = "SELECT COUNT(*) as so_luong FROM `tai_khoan` WHERE `ten_tai_khoan` = '"+username+"' AND "+"`mat_khau` = '"+password+"'" ;
//            
//            ResultSet rs =  DataProvider.connect(query, true);
//            while(rs.next()){
//                if(rs.getInt("so_luong") == 1){
//                    return true;
//                }
//            }
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//        return false;
//    }
    public void addData(String []arr, int ma_quyen){
        String query = "INSERT INTO `tai_khoan` (`ma_tai_khoan`, `ten_tai_khoan`, `ten_hien_thi`, `mat_khau`, `phan_quyen`) "
                + "VALUES (NULL, '"+arr[0]+"', '"+arr[1]+"', '1', '"+ma_quyen+"')";
        DataProvider.connect(query, false);
    }
    public void delData(int ma_tai_khoan){
        String query = "DELETE FROM `tai_khoan` WHERE `ma_tai_khoan` = '"+ma_tai_khoan+"'";
        DataProvider.connect(query, false);
    }
    public void updateData(int []arr_num, String []arr){
        String query = "UPDATE `tai_khoan` SET `ten_tai_khoan` = '"+arr[0]+"' AND `ten_hien_thi` = '"+arr[1]+"' "
                + "AND `"+arr[2]+"` AND `phan_quyen` = '"+arr_num[1]+"' WHERE `ma_tai_khoan` = '"+arr_num[0]+"'";
        DataProvider.connect(query, false);
    }
//    public TaiKhoanDTO searchAccount(int ma_tai_khoan){
//        for (TaiKhoanDTO x : getListAccount()) {
//            if(x.getMa_tai_khoan() == ma_tai_khoan){
//                return x;
//            }
//        }
//        return null;
//    }
//    public int getMPQFromQuyen(String quyen){
//        try {
//            String query = "SELECT `ma_quyen` FROM `phan_quyen` WHERE `quyen` = '"+quyen+"'";
//            
//            ResultSet rs = DataProvider.connect(query, true);
//            int idx = 0;
//            while(rs.next()){
//                idx = rs.getInt("ma_quyen");
//            }
//            return idx;
//        } catch (SQLException ex) {
//            Logger.getLogger(TaiKhoanDAL.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return -1;
//    }
}
