/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapper;

import java.sql.ResultSet;
import model.Question;

/**
 *
 * @author Gib
 */
public class QuestionMapper implements RowMapper<Question>{

    @Override
    public Question MapRow(ResultSet rs) {
        try {
            Question q = new Question(rs.getInt(1),
                    rs.getInt(2),
                    rs.getString(3),
                    rs.getBoolean(4)
            );
            return q;
        } catch (Exception e) {
            return null;
        }
    }
    
}
