/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapper;

import java.sql.ResultSet;
import model.Category;
import model.Enroll;


public class EnrollMapper implements RowMapper<Enroll>{

    @Override
    public Enroll MapRow(ResultSet rs) {
        try {
            Enroll c = new Enroll(rs.getString(1), 
                    rs.getInt(2)
            );
            return c;
        } catch (Exception e) {
            return null;
        }
    }
    
}
