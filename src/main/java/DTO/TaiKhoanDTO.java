/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author mizuk
 */
public class TaiKhoanDTO {
    private int ma_tai_khoan;
    private String ten_tai_khoan;
    private String ten_hien_thi;
    private String mat_khau;
    private int phan_quyen;
 
    
    public int getMa_tai_khoan() {
        return ma_tai_khoan;
    }

    public void setMa_tai_khoan(int ma_tai_khoan) {
        this.ma_tai_khoan = ma_tai_khoan;
    }

    public String getTen_tai_khoan() {
        return ten_tai_khoan;
    }

    public void setTen_tai_khoan(String ten_tai_khoan) {
        this.ten_tai_khoan = ten_tai_khoan;
    }

    public String getTen_hien_thi() {
        return ten_hien_thi;
    }

    public void setTen_hien_thi(String ten_hien_thi) {
        this.ten_hien_thi = ten_hien_thi;
    }

    public String getMat_khau() {
        return mat_khau;
    }

    public void setMat_khau(String mat_khau) {
        this.mat_khau = mat_khau;
    }

    public int getPhan_quyen() {
        return phan_quyen;
    }

    public void setPhan_quyen(int phan_quyen) {
        this.phan_quyen = phan_quyen;
    }   
    
    public TaiKhoanDTO(){
    }
        public TaiKhoanDTO(int ma_tai_khoan, String ten_tai_khoan, String ten_hien_thi, String mat_khau, int phan_quyen) {
        this.ma_tai_khoan = ma_tai_khoan;
        this.ten_tai_khoan = ten_tai_khoan;
        this.ten_hien_thi = ten_hien_thi;
        this.mat_khau = mat_khau;
        this.phan_quyen = phan_quyen;
    }

    

}
