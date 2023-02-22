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

    private PostDao postDAO;
    
    public PostService(){
        postDAO = new PostDao();
    }
    
    private static PostService instance = null;
    
    public static PostService getInstance(){
        if(instance == null){
            instance = new PostService();
        }
        return instance;
    }
            
    
    @Override
    public List<Post> getTopTwo() {
        List<Post> list = postDAO.getTopTwo();
        if (list == null || list.isEmpty()) {
            return null;
        } else {
            return list;
        }
    }
    
}
