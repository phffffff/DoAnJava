/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.util.List;
import DTO.BillDTO;
import DTO.BillInfoDTO;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mizuk
 */
public class BillDAL {
    List <BillDTO> listBill = new ArrayList<BillDTO>();
    public  void getDataFromMySql(){
        ResultSet rs = null;
        try{
            String query = "SELECT * FROM `bill`";
            
            rs = DataProvider.resultset(query, true);
            while(rs.next()){
                listBill.add(new BillDTO(
                    rs.getInt("bill_id"),
                    rs.getDate("date_checkin"),
                    rs.getDate("date_checkout"),
                    rs.getInt("table_id"),
                    rs.getInt("status")
                ));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    //lấy BillId từ những Bill đã chưa checkout (status = 0)
    public int getBillIdNoCheckout(int table_id){
        ResultSet rs = null;
        try{
            String query = "SELECT bill_id FROM `bill` WHERE status = "+0+" AND table_id = "+table_id;
            
            rs = DataProvider.resultset(query, true);
            
            return rs.getInt("bill_id");
        }catch(SQLException e){
            e.printStackTrace();
        }
        return -1;
    }
}

