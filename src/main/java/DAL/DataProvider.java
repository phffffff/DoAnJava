/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;


import java.sql.Statement;
import java.sql.ResultSet;
import connection.ConnectionDatabase;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author mizuk
 */
public class DataProvider {
    public static ResultSet resultset(String query, boolean flag){
        ResultSet rs = null;
        try {
            Statement s = ConnectionDatabase.connect().createStatement();
            if(flag){
                rs = s.executeQuery(query);
            }
            else{
                s.executeUpdate(query);
            }
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
        
    }
}
