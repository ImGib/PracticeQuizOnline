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

    private int nrpp = 2;
    private int totalPage = 2;
    private int size;
    private int begin;
    private int end;

    public static PagginationUtil instance = null;

    public static PagginationUtil getInstance() {
        if (instance == null) {
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

    public void setNrpp(int nrpp) {
        this.nrpp = nrpp;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getBegin() {
        return begin;
    }
    public int getEnd() {
        return end;
    }

    public int pageIndex(int pageIndex, int size) {

        totalPage = (size + nrpp - 1) / nrpp;

        pageIndex = pageIndex > totalPage ? totalPage : pageIndex;
        pageIndex = pageIndex < 1 ? 1 : pageIndex;
        return pageIndex;
    }
    
    public void setPageBegin_Ending(int pageIndex, int plus){
        if (pageIndex <= plus) {
            begin = 1; 
        } else {
            begin = pageIndex - plus;
        }
        if (pageIndex >= totalPage-plus) {
            end = totalPage ;
        } else {
            end = pageIndex + plus;
        }
    }
}
