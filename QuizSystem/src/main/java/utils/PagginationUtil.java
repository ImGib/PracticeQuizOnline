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

    private int nrpp = 5;
    private int totalPage = 2;
    private int size;
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

    public int pageIndex(int pageIndex, int size) {

        this.totalPage = (size + nrpp - 1) / nrpp;

        pageIndex = pageIndex > totalPage ? totalPage : pageIndex;
        pageIndex = pageIndex < 1 ? 1 : pageIndex;
        return pageIndex;
    }
}
