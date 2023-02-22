/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.IPostDao;
import java.util.List;
import mapper.PostMapper;
import model.Post;

public class PostDao extends AbstractDao<Post> implements IPostDao{

    @Override
    public List<Post> getTopTwo() {
        String sql = "select top 2 * from Post\n" +
                    "order by publicDate desc";
        return query(sql, new PostMapper());
    }
    

    @Override
    public int getNumberPost() {
        String sql = "select count(id)\n"
                + "from Post";
        return count(sql);
    }

}
