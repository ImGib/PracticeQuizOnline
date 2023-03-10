/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.ISliderDao;
import java.util.List;
import mapper.SliderMapper;
import model.Slider;

/**
 *
 * @author Gib
 */
public class SliderDao extends AbstractDao<Slider> implements ISliderDao{

    @Override
    public List<Slider> getAll() {
        String sql = "select * from Slider";
        return query(sql, new SliderMapper());
    }
    
}
