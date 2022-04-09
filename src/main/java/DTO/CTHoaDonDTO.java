/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author mizuk
 */
public class CTHoaDonDTO {

    private int ma_hoa_don;
    private int ma_mon;
    private int so_luong;
    private int gia_mon;
    private int thanh_tien;
    
    public CTHoaDonDTO(){}
    
    public CTHoaDonDTO(int ma_hoa_don, int ma_mon, int so_luong, int gia_mon, int thanh_tien) {
        this.ma_hoa_don = ma_hoa_don;
        this.ma_mon = ma_mon;
        this.so_luong = so_luong;
        this.gia_mon = gia_mon;
        this.thanh_tien = thanh_tien;
    }
    
    public int getThanh_tien() {
        return thanh_tien;
    }

    public void setThanh_tien(int thanh_tien) {
        this.thanh_tien = thanh_tien;
    }
    public int getMa_hoa_don() {
        return ma_hoa_don;
    }

    public void setMa_hoa_don(int ma_hoa_don) {
        this.ma_hoa_don = ma_hoa_don;
    }

    public int getMa_mon() {
        return ma_mon;
    }

    public void setMa_mon(int ma_mon) {
        this.ma_mon = ma_mon;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public int getGia_mon() {
        return gia_mon;
    }

    public void setGia_mon(int gia_mon) {
        this.gia_mon = gia_mon;
    }
}
