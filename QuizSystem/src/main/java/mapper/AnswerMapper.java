/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Answer;

/**
 *
 * @author Lenovo
 */
public class AnswerMapper implements RowMapper<Answer>{

    @Override
    public Answer MapRow(ResultSet rs) {
        try {
            Answer a = new Answer();
            a.setIdAns(rs.getInt(1));
            a.setIdQues(rs.getInt(2));
            a.setIsCorrect(rs.getBoolean(3));
            a.setAnswer(rs.getString(4));
            return a;
        } catch (SQLException e) {
            return null;
        }
    }
    
}
