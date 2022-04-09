/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.*;
import DataProvider.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author mizuk
 */
public class HoaDonHienThiDAL {
    List <HoaDonHienThiDTO> listHoaDonHienThi = new  ArrayList<HoaDonHienThiDTO>();
    public void getDetailBill(int ma_ban){
        try{
//            String query = "SELECT mon_an.ten_mon, mon_an.gia,chi_tiet_hoa_don.count_food "
//                    + "FROM `bill_info`,`food_category`,`food`,`bill`,`table_food` "
//                    + "WHERE `bill_info`.`bill_id` = `bill`.`bill_id` "
//                    + "AND `food_category`.`category_id` = `food`.`category_id` "
//                    + "AND `table_food`.`table_id` = `bill`.`table_id` "
//                    + "AND `bill_info`.`food_id` = `food`.`food_id` "
//                    + "AND `bill`.`status` = "+0+" "
//                    + "AND `table_food`.`table_id` = "+table_id;
            ResultSet rs = DataProvider.connect("", true);
            while(rs.next()){
                HoaDonHienThiDTO hoaDonHienThiDTO = new HoaDonHienThiDTO(
                        rs.getString("ten_mon"),
                        rs.getInt("gia"),
                        rs.getInt("so_luong"),
                        rs.getInt("gia")*rs.getInt("so_luong")
                );
                listHoaDonHienThi.add(hoaDonHienThiDTO);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void getDetailBill(DefaultTableModel model){
        while(model.getRowCount() > 0){
            model.removeRow(0);
        }
        for (HoaDonHienThiDTO hoaDonHienThiDTO : listHoaDonHienThi) {
            model.addRow(new Object[]{
                hoaDonHienThiDTO.getTen_mon(),
                hoaDonHienThiDTO.getGia(),
                hoaDonHienThiDTO.getSo_luong(),
                hoaDonHienThiDTO.getThanh_tien()
            });
        }
//        listDetailBill = null;
        model.fireTableDataChanged();
    }
    public int total_price(){
        int sum = 0;
        for (HoaDonHienThiDTO detailBillDTO : listHoaDonHienThi) {
            sum += detailBillDTO.getThanh_tien();
        }
        return sum;
    }
    public HoaDonHienThiDTO setFoodToBill(int food_id){
        try{
            String query = "SELECT `mon_an`.`ten_mon`, `mon_an`.`gia`,`chi_tiet_hoa_don`.`so_luong` "
                    + "FROM `cho_tiet_hoa_don`,`mon_an`,`hoa_don` "
                    + "WHERE `mon_an`.`ma_mon` = `chi_tiet_hoa_don`.`ma_mon` "
                    + "AND `hoa_don`.`ma_hoa_don` = `chi_tiet_hoa_don`.`ma_hoa_don` "
                    + "AND `mon_an`.`ma_mon` = "+food_id;
            
            ResultSet rs = DataProvider.connect(query, true);
            
            HoaDonHienThiDTO hoaDonHienThiDTO = null;
                    
            while(rs.next()){
                hoaDonHienThiDTO = new HoaDonHienThiDTO(
                        rs.getString("ten_mon"),
                        rs.getInt("gia"),
                        rs.getInt("so_luong"),
                        rs.getInt("gia")*rs.getInt("so_luong")
                );
            }
            return hoaDonHienThiDTO;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}

