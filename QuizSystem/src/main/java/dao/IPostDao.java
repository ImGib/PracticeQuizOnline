
package dao;

import java.util.List;
import model.Post;

public interface IPostDao extends GenericDao<Post>{
    List<Post> getTopTwo();
    
    public int getNumberPost();
}
