/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import dao.impl.PostDao;
import dao.impl.SlideDao;
import java.util.List;
import model.Post;
import model.Slide;
import service.IPostService;

public class PostService implements IPostService {

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
        return postDao.getTopTwo();
    }

    @Override
    public int getNumberPost() {
        return postDao.getNumberPost();
    }

    @Override
    public List<Post> findPostByTitleAndAuthor(String txt,String username) {
        return postDao.findPostByTitleAndAuthor(txt, username);
    }

    @Override
    public void addNewPost(Post p) {
        postDao.addNewPost(p);
    }

    @Override
    public String checkValidPost(String title) {
        if (postDao.findPostByTitle(title).size() != 0) {
            return "This Title already exist!!!";
        }
        return null;
    }

    @Override
    public List<Post> findPostById(int id) {
        return postDao.findPostById(id);
    }

    @Override
    public List<Post> findPostByTextAndPagination(String txt, int pageIndex, int nrpp,String username) {
        return postDao.findPostByTextAndPagination(txt, pageIndex, nrpp, username);
    }

    @Override
    public void editPost(int id, String img, String title, String detail) {
        postDao.editPost(id, img, title, detail);
    }

    @Override
    public void deletePost(int id) {
        postDao.deletePost(id);
    }

    @Override
    public String checkValidPostForEdit(int id, String title) {
        Post p = postDao.findPostById(id).get(0);
        if (p.getTittle().equals(title)) {
            return null;
        } else {
            if (postDao.findPostByTitle(title).size() != 0) {
                return "This Title already exist!!!";
            }
            else{
                return null;
            }

        }
    }

    @Override
    public void upNumberAccess(int i) {
        postDao.upNumberAccess(i);
    }

    public List<Post> getTopPopular() {
        return postDao.getTopPopular();
    }

    @Override
    public List<Post> getPostPagination(String txt, int pageIndex, int nrpp) {
        return postDao.findPostByText(txt, pageIndex, nrpp);
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
    public int getLastIdPost() {
        return postDao.getLastIdPost();
    }

}
