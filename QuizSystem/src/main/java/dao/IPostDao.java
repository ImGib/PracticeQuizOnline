
package dao;

import java.util.List;
import model.Post;

public interface IPostDao extends GenericDao<Post>{
    List<Post> getTopTwo();
    List<Post> getTopPopular();
    public int getNumberPost();
    List<Post> getPostPagination(String txt, int pageIndex, int nrpp);
    int countAllPost();
    int countPaginationPost(String txt);
    Post getPostDetails(String id);
    public void upNumberAccess(int id);
}
