/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;


import DTO.*;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author mizuk
 */
public class CategoryDAL {
    List <CategoryFoodDTO> listCategory = new ArrayList<CategoryFoodDTO>();
    
    public void getDataFromMySql(){
        ResultSet rs = null;
        try{
            String query = "SELECT * FROM `food_category` ORDER BY category_id ASC;";
            
            rs = DataProvider.resultset(query, true);
            while(rs.next()){
                listCategory.add(new CategoryFoodDTO(
                        rs.getInt("category_id"),
                        rs.getString("category_name")
                ));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void loadListCategoryToCombobox(JComboBox<String> cbxCategory){
        while(cbxCategory.getItemCount() > 0){
            cbxCategory.removeItemAt(0);
        }
        for (CategoryFoodDTO categoryFoodDTO : listCategory) {
            cbxCategory.addItem(categoryFoodDTO.getCategory_name());
        }
    }
}
