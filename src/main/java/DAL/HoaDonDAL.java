/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.util.List;
import DTO.*;
import DataProvider.*;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mizuk
 */
public class HoaDonDAL {
    List <HoaDonDTO> listBill = new ArrayList<HoaDonDTO>();
    public  void getDataFromMySql(){
        try{
            String query = "SELECT * FROM `hoa_don`";
            
            ResultSet rs = DataProvider.connect(query, true);
            while(rs.next()){
                listBill.add(new HoaDonDTO(
                    rs.getInt("ma_hoa_don"),
                    rs.getDate("ngay_xuat"),
                    rs.getInt("trang_thai"),
                    rs.getInt("ma_nhan_vien"),
                    rs.getString("ma_thanh_vien"),
                    rs.getInt("ma_ban"),
                    rs.getInt("tong_tien"),
                    rs.getInt("tien_giam"),
                    rs.getInt("tien_con_lai"),
                    rs.getString("ma_phieu_giam_gia"),
                    rs.getInt("diem")                     
                ));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    //lấy BillId từ những Bill đã chưa checkout (status = 0)
    public int getBillIdNoCheckout(int ma_ban){
        
        try{
            String query = "SELECT ma_hoa_don FROM `hoa_don` WHERE trang_thai = "+0+" AND ma_ban = "+ma_ban;
            
            ResultSet rs = DataProvider.connect(query, true);
            
            return rs.getInt("ma_hoa_don");
        }catch(SQLException e){
            e.printStackTrace();
        }
        return -1;
    }
}

