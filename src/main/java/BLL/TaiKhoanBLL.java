/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.TaiKhoanDAL;
import DTO.TaiKhoanDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mizuk
 */
public class TaiKhoanBLL {
    public static List<TaiKhoanDTO> listTK = new ArrayList<>();

    public TaiKhoanBLL() {
    }
    public void resetListTk(){
        while(listTK.size() > 0){
            listTK.remove(0);
        }
    }
    public void loadListTk(){
        listTK = new TaiKhoanDAL().getData();
    }
    
    public boolean login(String username, String password){
        this.resetListTk();
        this.loadListTk();
        
        for (TaiKhoanDTO taiKhoanDTO : listTK) {
            if(taiKhoanDTO.getTen_tai_khoan().equals(username) && taiKhoanDTO.getMat_khau().equals(password)){
                return true;
            }
        }
        return false;
    }
    public void ThemTK(String []tk,int maquyen){
        new TaiKhoanDAL().addData(tk, maquyen);
        this.resetListTk();
        this.loadListTk();
        
    }
    public void suaTK(int []num,String []tk){
        new TaiKhoanDAL().updateData(num, tk);
        
        this.resetListTk();
        this.loadListTk();
    }
    public void delTK(int maTK){
        new TaiKhoanDAL().delData(maTK);
        this.resetListTk();
        this.loadListTk();
    }
}
