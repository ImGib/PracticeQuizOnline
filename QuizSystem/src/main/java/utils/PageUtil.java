/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author Lenovo
 */
public class PageUtil {

    private int index;
    private int nrpp;
    private int totalPage;
    private String search;
    private String userName;
    private int idSub;

    public PageUtil() {
    }

    public PageUtil(int index, int nrpp, int totalPage, String search, String userName, int idSub) {
        this.index = index;
        this.nrpp = nrpp;
        this.totalPage = totalPage;
        this.search = search;
        this.userName = userName;
        this.idSub = idSub;
    }
    
    

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getNrpp() {
        return nrpp;
    }

    public void setNrpp(int nrpp) {
        this.nrpp = nrpp;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int numberProduct) {
        this.totalPage = numberProduct % nrpp == 0 ? numberProduct / nrpp : numberProduct / nrpp + 1;
    }
    
    public int getOffSet(){
        return (getIndex() - 1)*getNrpp();
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getIdSub() {
        return idSub;
    }

    public void setIdSub(int idSub) {
        this.idSub = idSub;
    }

    
    

}
