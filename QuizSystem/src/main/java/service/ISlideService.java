/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.Slide;

/**
 *
 * @author asus
 */
public interface ISlideService {
    List<Slide> loadSlidePagination(int pageIndex,int nrpp);
    
    void addSlide(Slide s);
    
    void editSlide(int id,String img, String hlink);
    
    void deleteSlide(int id);
    
    List<Slide> findSlideById(int id);
    
    List<Slide> findAllSlide();
    
    int lastIndex();
    List<Slide> getAll();
}
