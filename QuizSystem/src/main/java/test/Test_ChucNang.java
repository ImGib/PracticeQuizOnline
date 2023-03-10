/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import dao.impl.AbstractDao;
import dao.impl.AccountDao;
import dao.impl.SliderDao;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import model.Account;
import model.Answer;
import model.Category;
import model.Post;
import model.Question;
import model.Slider;
import model.SubType;
import model.Subject;
import org.bouncycastle.pqc.math.linearalgebra.RandUtils;
import service.impl.AccountService;
import service.impl.CategoryService;
import service.impl.EnrollService;
import service.impl.PostService;
import service.impl.QuestionService;
import service.impl.SliderService;
import service.impl.SubjectService;
import sun.security.provider.CtrDrbg;
import utils.PagginationUtil;
import utils.RandomAccountUtil;
import utils.RandomUtil;
import utils.SessionUtil;

/**
 *
 * @author asus
 */
public class Test_ChucNang {

    public static void main(String[] args) {
        
        System.out.println(SubjectService.getInstance().countEnrollByUsername("trangiabao5102@gmail.com"));
    }
}
