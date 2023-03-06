/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapper;

import java.sql.ResultSet;
import model.Post;

public class PostMapper implements RowMapper<Post>{

    @Override
    public Post MapRow(ResultSet rs) {
        try {
            Post p = new Post(rs.getInt(1), 
                    rs.getString(2), 
                    rs.getDate(3).toString(),
                    rs.getString(4),
                    rs.getString(5), 
                    rs.getString(6),
                    rs.getInt(7)
            );
            return p;
        } catch (Exception e) {
            return null;
        }
    }
}
