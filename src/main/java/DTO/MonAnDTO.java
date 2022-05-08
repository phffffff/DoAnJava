/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author mizuk
 */
public class MonAnDTO {

    public String getMa_mon() {
        return ma_mon;
    }

    public void setMa_mon(String ma_mon) {
        this.ma_mon = ma_mon;
    }


    private String ma_mon;
    private String ten_mon;
    private int so_luong;
    private int gia;
    
    public MonAnDTO() {
    }

    public MonAnDTO(String ten_mon) {
        this.ten_mon = ten_mon;
    }
 
    public MonAnDTO(String ma_mon, String ten_mon, int so_luong, int gia) {
        this.ma_mon = ma_mon;
        this.ten_mon = ten_mon;
        this.so_luong = so_luong;
        this.gia = gia;
    }

    public String getTen_mon() {
        return ten_mon;
    }

    public void setTen_mon(String ten_mon) {
        this.ten_mon = ten_mon;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
       
}
