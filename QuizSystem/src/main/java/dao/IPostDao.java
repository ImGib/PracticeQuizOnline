
package dao;

import java.util.List;
import model.Post;

public interface IPostDao extends GenericDao<Post>{
    List<Post> getTopTwo();
    
    public int getNumberPost();
    
    List<Post> findPostByTitleAndAuthor(String txt);
    
    void addNewPost(Post p);
    
    int getLastIdPost();
    
    List<Post> findPostByTitle(String txt);
    
    List<Post> findPostById(int id);
    
    List<Post> findPostByTextAndPagination(String txt,int pageIndex,int nrpp);
    
    void editPost(int id,String img, String title,String detail);
    
    void deletePost(int id);
}
