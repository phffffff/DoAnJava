package DTO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mizuk
 */
public class BanAnDTO {
    private int ma_ban;
    private String ban;
    private int trang_thai;

    public  BanAnDTO(){
    }

    public BanAnDTO(int ma_ban, String ban, int trang_thai) {
        this.ma_ban = ma_ban;
        this.ban = ban;
        this.trang_thai = trang_thai;
    }    
    
        public int getMa_ban() {
        return ma_ban;
    }

    public void setMa_ban(int ma_ban) {
        this.ma_ban = ma_ban;
    }

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }

    public int getTrang_thai() {
        return trang_thai;
    }

    public void setTrang_thai(int trang_thai) {
        this.trang_thai = trang_thai;
    }
    

}
