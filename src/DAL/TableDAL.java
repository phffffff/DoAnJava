/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.AccountDTO;
import DTO.TableDTO;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import connection.ConnectionDatabase;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mizuk
 */
public class TableDAL {
    List <TableDTO> listTable = new ArrayList<TableDTO>();
    public void getDataFromMySql(){
        ResultSet rs = null;
        try{
            String query = "SELECT * FROM `table_food`";
            
            rs = DataProvider.resultset(query, true);
            
            while(rs.next()){
                TableDTO data = new TableDTO(
                    rs.getInt("table_id"),
                    rs.getString("table_name"),
                    rs.getInt("status")
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
        for (TableDTO tableDTO : listTable) {
            model.addRow(new Object[]{tableDTO.getTable_id(),tableDTO.getTable_name(),(tableDTO.getStatus() == 1 ? "Có người":"Bàn trống")});
        }
        model.fireTableDataChanged();
    }
}
