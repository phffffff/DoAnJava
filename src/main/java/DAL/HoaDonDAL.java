/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.util.List;
import DTO.*;
import DataProvider.*;
import java.sql.Date;
//import java.util.Date;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

/**
 *
 * @author mizuk
 */
public class HoaDonDAL {
    List <HoaDonDTO> listBill = new ArrayList<HoaDonDTO>();
    public  List<HoaDonDTO> getData(){
        try{
            String query = "SELECT * FROM `hoa_don`";
            
            ResultSet rs = DataProvider.connect(query, true);
            while(rs.next()){
                listBill.add(new HoaDonDTO(
                    rs.getInt("ma_hoa_don"),
                    rs.getDate("ngay_xuat"),
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
            return listBill;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    //lấy BillId từ những Bill đã chưa checkout (status = 0)
    public void addData(String []arr, int []num){
        long millis=System.currentTimeMillis();
        Date date = new Date(millis);
        int s = 0;
        String query = "INSERT INTO `hoa_don`(`ma_hoa_don`, `ngay_xuat`, `ma_nhan_vien`, `ma_thanh_vien`, `tong_tien`, `tien_giam`, `tien_con_lai`, `ma_phieu_giam_gia`, `diem`) "
        + "VALUES (NULL,'"+date+"','"+arr[0]+"','"+arr[1]+"','"+num[0]+"','"+num[1]+"','"+(num[0]-num[1])+"','"+arr[1]+"','"+num[2]+"')";
        
        DataProvider.connect(query, false);
    }
    public void delData(int ma_hoa_don){
        String query = "DELETE FROM `hoa_don` WHERE `ma_hoa_don` = '"+ ma_hoa_don+"'";
        DataProvider.connect(query, false);
    }
}

