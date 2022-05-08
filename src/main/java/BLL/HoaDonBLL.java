/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.HoaDonDAL;
import DTO.HoaDonDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mizuk
 */
public class HoaDonBLL {
    public static List<HoaDonDTO> listHD = new ArrayList<>();
    
    public HoaDonBLL(){
    }
    
    public void resetListHD(){
        while(listHD.size() > 0){
            listHD.remove(0);
        }
    }
    public void loadListHD(){
        listHD = new HoaDonDAL().getData();
    }
    public void CreateHD(String []arr, int []num){
        new HoaDonDAL().addData(arr, num);
        this.resetListHD();
        this.loadListHD();
    }
}
