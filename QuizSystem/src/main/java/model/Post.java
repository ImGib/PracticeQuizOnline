/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import jakarta.servlet.http.HttpServletRequest;
import service.impl.PostService;
import utils.DateUtil;
import utils.SessionUtil;
import model.Account;

public class Post {
   
    private int id;
    private String tittle;
    private String publicDate;
    private String img;
    private String details;
    private String idAuthor;
    private int numberAccess;

    public Post(String tittle, String img, String details, String idAuthor) {
        this.tittle = tittle;
        this.img = img;
        this.details = details;
        this.idAuthor = idAuthor;
        publicDate=DateUtil.getDate();
        numberAccess=0;
        id=PostService.getInstance().getLastIdPost()+1;
    }

    public Post(int id, String tittle, String publicDate, String img, String details, String idAuthor, int numberAccess) {
        this.id = id;
        this.tittle = tittle;
        this.publicDate = publicDate;
        this.img = img;
        this.details = details;
        this.idAuthor = idAuthor;
        this.numberAccess = numberAccess;
    }
    

    

    public Post() {
    }

    public int getNumberAccess() {
        return numberAccess;
    }

    public void setNumberAccess(int numberAccess) {
        this.numberAccess = numberAccess;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(String publicDate) {
        this.publicDate = publicDate;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(String idAuthor) {
        this.idAuthor = idAuthor;
    }

}
