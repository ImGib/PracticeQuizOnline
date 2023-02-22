/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapper;

import java.sql.ResultSet;
import model.Category;

/**
 *
 * @author Gib
 */
public class CategoryMapper implements RowMapper<Category>{

    @Override
    public Category MapRow(ResultSet rs) {
        try {
            Category c = new Category(rs.getInt(1), 
                    rs.getString(2)
            );
            return c;
        } catch (Exception e) {
            return null;
        }
    }
    
}
