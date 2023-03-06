/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import dao.impl.AccountDao;
import dao.impl.SliderDao;
import java.util.List;
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

/**
 *
 * @author asus
 */
public class Test_ChucNang {

    public static void main(String[] args) {
        System.out.println(PostService.getInstance().countSearchPost(""));
        int size = PostService.getInstance().countSearchPost("");
        PagginationUtil.getInstance().setNrpp(4);
        System.out.println(PagginationUtil.getInstance().pageIndex(1, size));
        System.out.println(PagginationUtil.getInstance().getTotalPage());
        List<Post> list = PostService.getInstance().getPostPagination("", 1, PagginationUtil.getInstance().getNrpp());
        System.out.println(list.size());
    }
}
