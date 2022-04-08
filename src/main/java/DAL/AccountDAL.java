/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;
import DTO.AccountDTO;
import connection.ConnectionDatabase;
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
public class AccountDAL {
    List <AccountDTO> listAccount = new ArrayList <AccountDTO>();
    public void getDataFromMySql(){
        ResultSet rs = null;
        try{
            String query = "SELECT * FROM `tai_khoan`";
            
            rs = DataProvider.resultset(query,true);
            
            while(rs.next()){
                AccountDTO data = new AccountDTO(
                    rs.getInt("idAccount"),
                    rs.getString("user_name"),
                    rs.getString("display_name"),
                    rs.getString("password"),
                    rs.getInt("type")
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
        for (AccountDTO accountDTO : listAccount) {
            model.addRow(new Object[]{accountDTO.getIdAccount() ,accountDTO.getUsername(),accountDTO.getDisplayName(),accountDTO.getPassword(),accountDTO.getType()});
        }
        model.fireTableDataChanged();
    }
    public boolean login(String username, String password){
        ResultSet rs = null;
        try{
            String query = "SELECT * FROM `tai_khoan` WHERE username = '"+username+"' AND password = '"+password+"'";
            
            rs = DataProvider.resultset(query, true);
            
            if(rs.next()){
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
