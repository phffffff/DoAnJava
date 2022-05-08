///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package DAL;
//
//import java.util.List;
//import DataProvider.*;
//import DTO.*;
//import java.util.ArrayList;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
///**
// *
// * @author mizuk
// */
//public class CTHoaDonDAL {
//    List <CTHoaDonDTO> listBillInfo = new ArrayList<CTHoaDonDTO>();
//    public void getDataFromMySql(){
//        
//        try{
//            String query = "SELECT * FROM `chi_tiet_hoa_don`";
//            
//            ResultSet rs  = DataProvider.connect(query, true);
//            while(rs.next()){
//                listBillInfo.add(new CTHoaDonDTO(
//                    rs.getInt("ma_hoa_don"),
//                    rs.getInt("ma_mon"),
//                    rs.getInt("so_luong"),
//                    rs.getInt("gia_mon"),
//                    rs.getInt("thanh_tien")
//                ));
//            }
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//    }
//    public void insertBillInfo(int ma_hoa_don, int ma_mon, int so_luong, int gia_mon, int thanh_tien){
//        String query = String.format("INSERT INTO `bill_info` (`ma_hoa_don`, `ma_mon`, `so_luong`, `gia_mon`,`thanh_tien`) VALUES (%d, %d, %d, %d, %d);",ma_hoa_don,ma_mon,so_luong,gia_mon, thanh_tien);
//        ResultSet rs  = DataProvider.connect(query, true);
//    }
//}
