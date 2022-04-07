/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author mizuk
 */
public class BillDTO {
    private int bill_id;
    private Date date_checkin;
    private Date date_checkout;
    private int table_id;
    private int status;
    
    public  BillDTO(){
    }
    
    public BillDTO(int bill_id, Date date_checkin, Date date_checkout, int table_id, int status){
        setBill_id(bill_id);
        setDate_checkin(date_checkin);
        setDate_checkout(date_checkout);
        setTable_id(table_id);
        setStatus(status);
    }
    
    public int getBill_id() {
        return bill_id;
    }

    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    public Date getDate_checkin() {
        return date_checkin;
    }

    public void setDate_checkin(Date date_checkin) {
        this.date_checkin = date_checkin;
    }

    public Date getDate_checkout() {
        return date_checkout;
    }

    public void setDate_checkout(Date date_checkout) {
        this.date_checkout = date_checkout;
    }

    public int getTable_id() {
        return table_id;
    }

    public void setTable_id(int table_id) {
        this.table_id = table_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
