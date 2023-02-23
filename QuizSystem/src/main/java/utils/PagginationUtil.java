/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author asus
 */
public class PagginationUtil {
    public static int nrpp=5;
    private int totalPage=0;
    
    public static PagginationUtil instance=null;
    
    public static PagginationUtil getInstance(){
        if(instance == null){
            instance = new PagginationUtil();
        }
        return instance;
    }

    private PagginationUtil() {
        
    }
    
    
    public int getTotalPage() {
        return totalPage;
    }
    
    public int getNrpp() {
        return nrpp;
    }
    
    
    
    public int pageIndex(int pageIndex,int size){
        
        
//        totalPage = (size + nrpp - 1) / nrpp;
        totalPage = size % nrpp > 0 ? size/nrpp+1 : size/nrpp;
        pageIndex = pageIndex > totalPage ? totalPage : pageIndex;
        pageIndex = pageIndex < 1 ? 1 : pageIndex;
        return pageIndex;
    }
}
