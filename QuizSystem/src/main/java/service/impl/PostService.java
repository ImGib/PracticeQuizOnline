/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import dao.impl.PostDao;
import java.util.List;
import model.Post;
import service.IPostService;


public class PostService implements IPostService{


    private PostDao postDao;

    private PostService() {
        postDao = new PostDao();
    }

    private static PostService instance = null;

    public static PostService getInstance() {
        if (instance == null) {
            instance = new PostService();
        }
        return instance;
    }

            
    
    @Override
    public List<Post> getTopTwo() {
        List<Post> list = postDao.getTopTwo();
        if (list == null || list.isEmpty()) {
            return null;
        } else {
            return list;
        }
    }
    

    @Override
    public int getNumberPost() {
        return postDao.getNumberPost();
    }

    @Override
    public List<Post> getTopPopular() {
        return postDao.getTopPopular();
    }

    @Override
    public List<Post> getPostPagination(String txt, int pageIndex, int nrpp) {
        return postDao.getPostPagination(txt, pageIndex, nrpp);
    }

    @Override
    public int countPost() {
        return postDao.countAllPost();
    }

    @Override
    public int countSearchPost(String txt) {
        return postDao.countPaginationPost(txt);
    }
    
    @Override
    public Post getPostDetails(String i) {
        return postDao.getPostDetails(i);
    }

    @Override
    public void upNumberAccess(int id) {
        postDao.upNumberAccess(id);
    }
}
