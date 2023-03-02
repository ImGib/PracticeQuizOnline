/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import dao.impl.AccountDao;
import java.util.List;
import model.Account;
import model.Answer;
import model.Category;
import model.Question;
import model.SubType;
import model.Subject;
import org.bouncycastle.pqc.math.linearalgebra.RandUtils;
import service.impl.AccountService;
import service.impl.CategoryService;
import service.impl.QuestionService;
import service.impl.SubjectService;
import sun.security.provider.CtrDrbg;
import utils.RandomAccountUtil;
import utils.RandomUtil;

/**
 *
 * @author asus
 */
public class Test_ChucNang {
    public static void main(String[] args) {
        List<Category> cateList= CategoryService.getInstance().getCateBySubId(4);
        for(Category ct : cateList){
            System.out.println(ct.getName());
        }
    }
}
