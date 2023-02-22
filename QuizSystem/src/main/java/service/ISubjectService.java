
package service;

import java.util.List;
import model.Subject;

/**
 *
 * @author Gib
 */
public interface ISubjectService {
    public List<Subject> getTopThree();
    public int getNumberSubject();
    
    public List<Subject> getAllSubject();
}
