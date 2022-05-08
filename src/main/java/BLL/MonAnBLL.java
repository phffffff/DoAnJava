/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.MonAnDAL;
import DTO.MonAnDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author mizuk
 */
public class MonAnBLL {
    public static List<MonAnDTO> listMA = new ArrayList<>();
    
    public MonAnBLL(){
    }
    
    public void resetListMA(){
        while(listMA.size() > 0){
            listMA.remove(0);
        }
    }
    public void loadListMA(){
        listMA = new MonAnDAL().getData();
    }
    public void getListToTable(DefaultTableModel model){
        this.resetListMA();
        this.loadListMA();
        
       while(model.getRowCount() > 0){
           model.removeRow(0);
       }
       for (MonAnDTO monAnDTO : listMA) {
            model.addRow(new Object[]{
                monAnDTO.getMa_mon(),
                monAnDTO.getTen_mon(),
                monAnDTO.getGia(),
                monAnDTO.getSo_luong(),
            });
       }
       model.fireTableDataChanged();
    }
    public int getCountFood(String maMon){
        this.resetListMA();
        this.loadListMA();
        
        for (MonAnDTO monAnDTO : listMA) {
            if(monAnDTO.getMa_mon().equals(maMon)){
                return monAnDTO.getSo_luong();
            }
        }
        return -1;
    }
    public MonAnDTO getFood(String maMon){
        this.resetListMA();
        this.loadListMA();
        
        for (MonAnDTO monAnDTO : listMA) {
            if(monAnDTO.getMa_mon().equals(maMon)){
                return monAnDTO;
            }
        }
        return null;
    }
}
