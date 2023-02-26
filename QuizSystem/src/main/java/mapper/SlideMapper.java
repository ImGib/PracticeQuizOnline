/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapper;

import java.sql.ResultSet;
import javax.swing.plaf.SliderUI;
import model.Post;
import model.Slide;

/**
 *
 * @author asus
 */
public class SlideMapper implements RowMapper<Slide>{
    private static SlideMapper instance = null;

    public static SlideMapper getInstance() {
        if (instance == null) {
            instance = new SlideMapper();
        }
        return instance;
    }

    public SlideMapper() {
    }

    @Override
    public Slide MapRow(ResultSet rs) {
        try {
            Slide p = new Slide(rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4));
            return p;
        } catch (Exception e) {
            return null;
        }
    }
}
