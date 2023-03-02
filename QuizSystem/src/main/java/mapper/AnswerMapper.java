/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapper;

import java.sql.ResultSet;
import model.Answer;

/**
 *
 * @author Gib
 */
public class AnswerMapper implements RowMapper<Answer>{

    @Override
    public Answer MapRow(ResultSet rs) {
        try {
            Answer a = new Answer(rs.getInt(1),
                    rs.getInt(2), 
                    rs.getBoolean(3),
                    rs.getString(4)
            );
            return a;
        } catch (Exception e) {
            return null;
        }
    }
    
}
