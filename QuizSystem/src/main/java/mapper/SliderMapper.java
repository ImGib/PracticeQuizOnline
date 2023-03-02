/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapper;

import java.sql.ResultSet;
import model.Slider;

/**
 *
 * @author Gib
 */
public class SliderMapper implements RowMapper<Slider>{

    @Override
    public Slider MapRow(ResultSet rs) {
        try {
            Slider s = new Slider(rs.getInt(0),
                    rs.getString(1), 
                    rs.getString(2), 
                    rs.getString(3)
            );
            return s;
        } catch (Exception e) {
            return null;
        }
    }
    
}
