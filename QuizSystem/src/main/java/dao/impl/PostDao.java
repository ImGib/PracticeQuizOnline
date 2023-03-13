/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.IPostDao;
import java.util.List;
import mapper.PostMapper;
import model.Post;
import service.impl.PostService;

public class PostDao extends AbstractDao<Post> implements IPostDao {

    @Override
    public List<Post> getTopTwo() {
        String sql = "select top 2 Post.* from\n"
                + "	Post left join Account\n"
                + "on idAuthor = userName\n"
                + "where isActive = 'True'\n"
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
    public List<Post> findPostByTitleAndAuthor(String txt) {
        String sql = "select * from Post\n"
                + "where title LIKE ? or\n"
                + "	  idAuthor LIKE ?";
        txt = "%" + txt + "%";
        return query(sql, new PostMapper(), txt, txt);
    }

    @Override
    public void addNewPost(Post p) {
        String sql = "insert into Post \n"
                + "values(?,?,?,?,?,0)";
        update(sql, p.getTittle(), p.getPublicDate(), p.getImg(), p.getDetails(), p.getIdAuthor());
    }

    @Override
    
    public List<Post> getTopPopular() {
        String sql = "select top 2 Post.* from\n"
                + "	Post left join Account\n"
                + "on idAuthor = userName\n"
                + "where isActive = 'True'\n"
                + "order by numberAccess DESC";
        return query(sql, new PostMapper());
    }

    @Override
    public int countAllPost() {
        String sql = "select COUNT(*) from Post";
        return count(sql);
    }

    @Override
    public List<Post> findPostByTitle(String txt) {
        String sql = "select * from Post\n"
                + "where title = ?";

        return query(sql, new PostMapper(), txt);
    }

    @Override
    public List<Post> findPostById(int id) {
        String sql = "select * from Post\n"
                + "where id = ?";

        return query(sql, new PostMapper(), id);
    }

    @Override
    public List<Post> findPostByTextAndPagination(String txt, int pageIndex, int nrpp) {
        String sql = "select * from Post\n"
                + "                where title LIKE ? or\n"
                + "                	  idAuthor LIKE ?\n"
                + "order by id\n"
                + "OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        txt = "%" + txt + "%";
        return query(sql, PostMapper.getInstance(), txt, txt, (pageIndex - 1) * nrpp, nrpp);
    }
    @Override
    public List<Post> getPostPagination(String txt, int pageIndex, int nrpp) {
        String sql = "select Post.* from \n"
                + "Post left join Account\n"
                + "on title like ? or idAuthor like ?\n"
                + "where idAuthor = userName and isActive = 'True'\n"
                + "order by id\n"
                + "OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        txt = "%" + txt + "%";
        return query(sql, PostMapper.getInstance(), txt, txt, (pageIndex - 1) * nrpp, nrpp);
    }

    @Override
    public void editPost(int id, String img, String title, String detail) {
        String sql = "update Post\n"
                + "set img=?,\n"
                + "	title=?,\n"
                + "	details=?\n"
                + "where id=?";
        update(sql, img, title, detail, id);
    }

    @Override
    public void deletePost(int id) {
        String sql = "delete from Post\n"
                + "where id=?";
        update(sql, id);
    
    }

    @Override
    public int countPaginationPost(String txt) {
        String sql = "select Count(*) from \n"
                + "Post left join Account\n"
                + "on title like ? or idAuthor like ?\n"
                + "where idAuthor = userName and isActive = 'True'";
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
        update(sql, id,id);
    }

    @Override
    public int getLastIdPost() {
        String sql="select MAX(id) from Post";
        return count(sql);
    }

}
