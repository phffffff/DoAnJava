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
public class BillInfoDAL {
    List <BillInfoDTO> listBillInfo = new ArrayList<BillInfoDTO>();
    public void getDataFromMySql(){
        ResultSet rs = null;
        try{
            String query = "SELECT * FROM `bill_info`";
            
            rs = DataProvider.resultset(query, true);
            while(rs.next()){
                listBillInfo.add(new BillInfoDTO(
                    rs.getInt("bill_info_id"),
                    rs.getInt("bill_id"),
                    rs.getInt("food_id"),
                    rs.getInt("count_food")
                ));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void insertBillInfo(int bill_id, int food_id, int count_food){
        ResultSet rs = null;
        try{
            String query = String.format("INSERT INTO `bill_info` (`bill_info_id`, `bill_id`, `food_id`, `count_food`) VALUES (NULL, %d, %d, %d);",bill_id,food_id,count_food);
            
            rs = DataProvider.resultset(query, false);

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
