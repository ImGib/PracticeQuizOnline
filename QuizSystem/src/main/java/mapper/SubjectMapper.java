/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Subject;

/**
 *
 * @author Gib
 */
public class SubjectMapper implements RowMapper<Subject> {

    private static SubjectMapper instance = null;

    public static SubjectMapper getInstance() {
        if (instance == null) {
            instance = new SubjectMapper();
        }
        return instance;
    }

    private SubjectMapper() {

    }

    @Override
    public Subject MapRow(ResultSet rs) {
        try {

            Subject s = new Subject(rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6));
            try {
                s.setIsPublic(rs.getBoolean(7));
            } catch (SQLException ex) {

            }

            try {
                s.setNumberEnroll(rs.getInt(8));
            } catch (SQLException e) {
            }
            
            try {
                s.setNumberQuestion(rs.getInt(9));
            } catch (SQLException e) {
            }
            return s;
        } catch (SQLException e) {
            return null;
        }
    }

}
