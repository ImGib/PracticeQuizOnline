/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
<<<<<<< Updated upstream
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.Post;

public interface IPostService {

    List<Post> getTopTwo();

    List<Post> getTopPopular();

    public int getNumberPost();

    List<Post> getPostPagination(String txt, int pageIndex, int nrpp);

    int countPost();
    
    int countSearchPost(String txt);

    Post getPostDetails(String id);
    
    public void upNumberAccess(int id);
}
