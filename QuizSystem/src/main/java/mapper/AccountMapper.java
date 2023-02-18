/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapper;

import model.Account;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class AccountMapper implements RowMapper<Account>{

    @Override
    public Account MapRow(ResultSet rs) {
        try {
            Account a = new Account(rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getInt(7),
                    rs.getString(8),
                    rs.getBoolean(9),
                    rs.getString(10));
            return a;
        } catch (SQLException e) {
            return null;
        }
    }
    
}
