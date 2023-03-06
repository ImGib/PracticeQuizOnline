/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Question;

/**
 *
 * @author Lenovo
 */
public class QuestionMapper implements RowMapper<Question>{

    @Override
    public Question MapRow(ResultSet rs) {
        try {
            Question  q = new Question();
            q.setId(rs.getInt(1));
            q.setInSub(rs.getInt(2));
            q.setQuestion(rs.getString(3));
            q.setSubject(rs.getString(4));
            return q;
        } catch (SQLException e) {
            return null;
        }
    }
    
}
