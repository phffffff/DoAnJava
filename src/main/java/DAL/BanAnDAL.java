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
public class BanAnDAL {
    List <BanAnDTO> listTable = new ArrayList<BanAnDTO>();
    public void getDataFromMySql(){

        try{
            String query = "SELECT * FROM `ban_an`";
            
            ResultSet rs  = DataProvider.connect(query, true);
            
            while(rs.next()){
                BanAnDTO data = new BanAnDTO(
                    rs.getInt("ma_ban"),
                    rs.getString("ban"),
                    rs.getInt("trang_thai")
                );
                listTable.add(data);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void loadDataToTablelist(DefaultTableModel model){
        while(model.getRowCount() > 0){
            model.removeRow(0);
        }
        for (BanAnDTO banAnDTO : listTable) {
            model.addRow(new Object[]{banAnDTO.getMa_ban(),banAnDTO.getBan(),(banAnDTO.getTrang_thai()== 1 ? "Có ng??i":"Bàn tr?ng")});
        }
        model.fireTableDataChanged();
    }
}
