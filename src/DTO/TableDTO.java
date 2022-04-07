package DTO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mizuk
 */
public class TableDTO {
    private int table_id;
    private String table_name;
    private int status;
    
    
    public  TableDTO(){
    }
    
    public  TableDTO(int table_id, String table_name, int Status){
        setTable_id(table_id);
        setTable_name(table_name);
        setStatus(Status);
    }
    
    public int getTable_id() {
        return table_id;
    }

    public void setTable_id(int table_id) {
        this.table_id = table_id;
    }

    public String getTable_name() {
        return table_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
    
}
