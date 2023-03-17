/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.Slide;

/**
 *
 * @author asus
 */
public interface ISlideDao extends GenericDao<Slide>{
    List<Slide> loadSlidePagination(int pageIndex,int nrpp);
    
    void addSlide(Slide s);
    
    void editSlide(int id,String img, String hlink);
    
    void deleteSlide(int id);
    
    List<Slide> findSlideById(int id);
    
    List<Slide> findAllSlide();
}
