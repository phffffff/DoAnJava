/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mizuk
 */
public class ConnectionDatabase {
    private static final String dbUrl = "jdbc:mysql://localhost:3306/project_java";
    private static final String user = "root";
    private static final String pass = "";
    
    
    public static Connection connect(){
        try {
            return DriverManager.getConnection(dbUrl, user, pass);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}    
