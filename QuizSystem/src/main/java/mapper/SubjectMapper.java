/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapper;

import java.sql.ResultSet;
import java.text.DateFormat;
import model.Subject;

/**
 *
 * @author Gib
 */
public class SubjectMapper implements RowMapper<Subject>{

    @Override
    public Subject MapRow(ResultSet rs) {
        try {
            Subject s = new Subject(rs.getInt(1), 
                    rs.getString(2), 
                    rs.getString(3), 
                    rs.getString(4),
                    rs.getDate(5).toString(),
                    rs.getString(6)
            );
            return s;
        } catch (Exception e) {
            return null;
        }
    }
    
}
