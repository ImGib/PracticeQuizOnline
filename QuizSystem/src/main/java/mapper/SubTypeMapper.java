/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.SubType;

/**
 *
 * @author Lenovo
 */
public class SubTypeMapper implements RowMapper<SubType>{

    @Override
    public SubType MapRow(ResultSet rs) {
        try {
            SubType subType = new SubType(rs.getInt(1), rs.getInt(2));
            return subType;
        } catch (SQLException e) {
            return null;
        }
    }
    
}
