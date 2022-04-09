/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataProvider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mizuk
 */
public class DataProvider {
    private static final String url = "jdbc:mysql://localhost:3306/do_an_java";
    private static final String user = "root";
    private static final String password  = "";
    
    public static Connection conn = null;
    public static Statement st = null;
    
    public static ResultSet connect(String query, boolean flag){
        try {
            conn = DriverManager.getConnection(url, user, password);
            
            Statement st = conn.createStatement();
            
            if(flag)
                return st.executeQuery(query);
            else
                st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DataProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}   
