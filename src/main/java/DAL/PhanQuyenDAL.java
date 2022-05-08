///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package DAL;
//
//import java.util.List;
//import java.util.ArrayList;
//import DTO.*;
//import java.sql.ResultSet;
//import DataProvider.DataProvider;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JComboBox;
//
///**
// *
// * @author mizuk
// */
//public class PhanQuyenDAL {
//    private List <PhanQuyenDTO> listPhanQuyen = new ArrayList();
//    public List<PhanQuyenDTO> getListPhanQuyen(){
//        return listPhanQuyen;
//    }
//    public void getDataFromMySlq(){
//        try {
//            String query = "SELECT *FROM `phan_quyen`";
//            
//            ResultSet rs = DataProvider.connect(query, true);
//            
//            while(rs.next()){
//                listPhanQuyen.add(new PhanQuyenDTO(
//                        rs.getInt("ma_quyen"),
//                        rs.getString("quyen")
//                ));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public void loadDataToComboBox(JComboBox <String> cbb){
//        while(cbb.getItemCount() > 0){
//            cbb.removeItemAt(0);
//        }
//        for (PhanQuyenDTO phanQuyenDTO : getListPhanQuyen()) {
//            String data = phanQuyenDTO.getQuyen();
//            cbb.addItem(data);
//        }
//    }
//}
