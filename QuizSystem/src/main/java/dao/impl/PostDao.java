/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.IPostDao;
import java.util.List;
import mapper.PostMapper;
import model.Post;

public class PostDao extends AbstractDao<Post> implements IPostDao {

    @Override
    public List<Post> getTopTwo() {
        String sql = "select top 2 * from Post\n"
                + "order by publicDate desc";
        return query(sql, new PostMapper());
    }

    @Override
    public int getNumberPost() {
        String sql = "select count(id)\n"
                + "from Post";
        return count(sql);
    }

    @Override
    public List<Post> getTopPopular() {
        String sql = "select top 2 * from Post\n"
                + "order by numberAccess DESC";
        return query(sql, new PostMapper());
    }

    @Override
    public int countAllPost() {
        String sql = "select COUNT(*) from Post";
        return count(sql);
    }

    @Override
    public List<Post> getPostPagination(String txt, int pageIndex, int nrpp) {
        String sql = "select * from Post \n"
                + "where title like ?\n"
                + "or idAuthor like ?\n"
                + "order by id\n"
                + "OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        txt = "%" + txt + "%";
        return query(sql, new PostMapper(), txt, txt, (pageIndex - 1) * nrpp, nrpp);

    }

    @Override
    public int countPaginationPost(String txt) {
        String sql = "select COUNT(*) from Post\n"
                + "where title like ?\n"
                + "or idAuthor like ?";
        txt = "%" + txt + "%";
        return count(sql, txt, txt);
    }

    @Override
    public Post getPostDetails(String i) {
        String sql = "select * from Post\n"
                + "where id = ?";
        return query(sql, new PostMapper(), i).get(0);
    }

    @Override
    public void upNumberAccess(int id) {
        String sql = "update Post\n"
                + "set numberAccess=(select numberAccess from Post\n"
                + "where id=?)+1\n"
                + "where id=?";
        update(sql, id, id);
    }
}
