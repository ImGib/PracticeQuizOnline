/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import service.IEnrollService;
import dao.impl.EnrollDao;
import java.util.List;
import model.Enroll;

public class EnrollService implements IEnrollService{

    private EnrollDao enrollDao;

    private EnrollService() {
        enrollDao = new EnrollDao();
    }

    private static EnrollService instance = null;

    public static EnrollService getInstance() {
        if (instance == null) {
            instance = new EnrollService();
        }
        return instance;
    }
    
    @Override
    public int getNumberEnrollByIdSub(int idSub) {
        return enrollDao.getNumberEnrollByIdSub(idSub);
    }

    @Override
    public int checkEnroll(String username, int idSub) {
        List<Enroll> list = enrollDao.checkEnroll(username, idSub);
        
        if(list.isEmpty())
            return -1;
        
        return list.get(0).getIdSub();
    }

    @Override
    public void enroll(String string, int i) {
        enrollDao.insertEnroll(string, i);
    }
    
}
