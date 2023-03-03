/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import dao.impl.SliderDao;
import java.util.List;
import model.Slider;
import service.ISliderService;

/**
 *
 * @author Gib
 */
public class SliderService implements ISliderService{

    private SliderDao sliderDao;

    public SliderService() {
        sliderDao = new SliderDao();
    }
    private static SliderService instance = null;
    public static SliderService getIntance(){
        if(instance==null){
            instance=new SliderService();
        }
        return instance;
    }
    @Override
    public List<Slider> getAll() {       
        return sliderDao.getAll();
    }
    
}
