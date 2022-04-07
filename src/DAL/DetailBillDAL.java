/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.DetailBillDTO;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author mizuk
 */
public class DetailBillDAL {
    List <DetailBillDTO> listDetailBill = new  ArrayList<DetailBillDTO>();
    public void getDetailBill(int table_id){
        ResultSet rs = null;
        try{
            String query = "SELECT food.food_name,food.price,bill_info.count_food "
                    + "FROM `bill_info`,`food_category`,`food`,`bill`,`table_food` "
                    + "WHERE `bill_info`.`bill_id` = `bill`.`bill_id` "
                    + "AND `food_category`.`category_id` = `food`.`category_id` "
                    + "AND `table_food`.`table_id` = `bill`.`table_id` "
                    + "AND `bill_info`.`food_id` = `food`.`food_id` "
                    + "AND `bill`.`status` = "+0+" "
                    + "AND `table_food`.`table_id` = "+table_id;
            rs = DataProvider.resultset(query, true);
            while(rs.next()){
                DetailBillDTO detailBillDTO = new DetailBillDTO(
                        rs.getString("food_name"),
                        rs.getInt("price"),
                        rs.getInt("count_food"),
                        rs.getInt("price")*rs.getInt("count_food")
                );
                listDetailBill.add(detailBillDTO);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void getDetailBill(DefaultTableModel model){
        while(model.getRowCount() > 0){
            model.removeRow(0);
        }
        for (DetailBillDTO detailBillDTO : listDetailBill) {
            model.addRow(new Object[]{
                detailBillDTO.getFood_name(),
                detailBillDTO.getPrice(),
                detailBillDTO.getFood_count(),
                detailBillDTO.getTotal_price()
            });
        }
//        listDetailBill = null;
        model.fireTableDataChanged();
    }
    public int total_price(){
        int sum = 0;
        for (DetailBillDTO detailBillDTO : listDetailBill) {
            sum += detailBillDTO.getTotal_price();
        }
        return sum;
    }
    public DetailBillDTO setFoodToBill(int food_id){
        ResultSet rs = null;
        try{
            String query = "SELECT `food`.`food_name`, `food`.`price`,`bill_info`.`count_food` "
                    + "FROM `bill_Info`,`food`,`bill` "
                    + "WHERE `food`.`food_id` = `bill_info`.`food_id` "
                    + "AND `bill`.`bill_id` = `bill_info`.`bill_id` "
                    + "AND `food`.`food_id` = "+food_id;
            
            rs = DataProvider.resultset(query, true);
            
            DetailBillDTO detailBillDTO = null;
                    
            while(rs.next()){
                detailBillDTO = new DetailBillDTO(
                        rs.getString("food_name"),
                        rs.getInt("price"),
                        rs.getInt("count_food"),
                        rs.getInt("price")*rs.getInt("count_food")
                );
            }
            return detailBillDTO;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}

