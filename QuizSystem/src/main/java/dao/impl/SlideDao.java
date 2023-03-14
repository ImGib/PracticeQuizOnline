/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.ISlideDao;
import java.util.List;
import mapper.SlideMapper;
import model.Slide;
import service.impl.SlideService;

/**
 *
 * @author asus
 */
public class SlideDao extends AbstractDao<Slide> implements ISlideDao {

    @Override
    public List<Slide> loadSlidePagination(int pageIndex, int nrpp) {
        String sql = "select * from Slider\n"
                + "order by id\n"
                + "OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        return query(sql, SlideMapper.getInstance(), (pageIndex - 1) * nrpp, nrpp);
    }

    @Override
    public void addSlide(Slide s) {
        String sql = "insert into Slider(img,hyperlink,idAuthor)\n"
                + "values(?,?,?)";
        update(sql, s.getImg(), s.getHyperlink(), s.getIdAuthor());
    }

   

    @Override
    public void deleteSlide(int id) {
        String sql = "delete Slider\n"
                + "where id=?";
        update(sql, id);
    }

    @Override
    public List<Slide> findSlideById(int i) {
        String sql = "select * from Slider\n"
                + "where id=?";
        return query(sql, SlideMapper.getInstance(),i);
    }

    @Override
    public List<Slide> findAllSlide() {
        String sql="select * from Slider";
        return query(sql, SlideMapper.getInstance());
    }

    @Override
    public void editSlide(int id, String img, String hlink) {
        String sql = "Update Slider\n"
                + "set img = ?,\n"
                + "hyperlink = ?\n"
                + "where id=?";
        update(sql, img,hlink,id);
    }
   
}
