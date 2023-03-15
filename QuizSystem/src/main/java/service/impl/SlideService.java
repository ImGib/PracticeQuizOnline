/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import dao.impl.SlideDao;
import java.util.List;
import model.Slide;
import model.Slider;
import service.ISlideService;

/**
 *
 * @author asus
 */
public class SlideService implements ISlideService {

    private SlideDao slideDao;

    private SlideService() {
        slideDao = new SlideDao();
    }
    private static SlideService instance = null;

    public static SlideService getInstance() {
        if (instance == null) {
            instance = new SlideService();
        }
        return instance;
    }

    @Override
    public List<Slide> loadSlidePagination(int pageIndex, int nrpp) {
        return slideDao.loadSlidePagination(pageIndex, nrpp);
    }

    @Override
    public void addSlide(Slide s) {
        slideDao.addSlide(s);
    }

    @Override
    public void editSlide(int id, String img, String hlink) {
        slideDao.editSlide(id, img, hlink);
    }

    @Override
    public void deleteSlide(int id) {
        slideDao.deleteSlide(id);
    }

    @Override
    public List<Slide> findSlideById(int id) {
        return slideDao.findSlideById(id);
    }

    @Override
    public List<Slide> findAllSlide() {
        return slideDao.findAllSlide();
    }

    @Override
    public int lastIndex() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Slide> getAll() {
        return slideDao.getAll();
    }
}
