/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
<<<<<<< Updated upstream
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.Post;
import model.Slide;

public interface IPostService {

    List<Post> getTopTwo();

    
    public int getNumberPost();
    
    List<Post> findPostByTitleAndAuthor(String txt);
    
    void addNewPost(Post p);
    
    int getLastIdPost();
    
    String checkValidPost(String title);
    
   List<Post> findPostById(int id);
   
   List<Post> findPostByTextAndPagination(String txt, int pageIndex, int nrpp);
   
   void editPost(int id,String img, String title,String detail);
    
    void deletePost(int id);
    
    String checkValidPostForEdit(int id,String title);
    
    void upNumberAccess(int id);
    
    


    List<Post> getTopPopular();

    

    List<Post> getPostPagination(String txt, int pageIndex, int nrpp);

    int countPost();
    
    int countSearchPost(String txt);

    Post getPostDetails(String id);
    
    

}
