/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import utils.CheckUtil;

public class Subject {
    private int id;
    private String name;
    private String img;
    private String description;
    private String publicdate;
    private String idAuthor;

    public Subject() {
    }

    public Subject(int id, String name, String img, String description, String publicdate, String idAuthor) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.description = description;
        this.publicdate = publicdate;
        this.idAuthor = idAuthor;
    }

    public String getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(String idAuthor) {
        this.idAuthor = idAuthor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublicdate() {
        return publicdate;
    }

    public void setPublicdate(String publicdate) {
        this.publicdate = publicdate;
    }
    
    public String diffirentDate() throws ParseException{
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date secondDate = sf.parse(CheckUtil.getDateNow());
        Date firstDate = sf.parse(this.publicdate);
        
        long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        String days = "";
        if (diff < 30) days = String.valueOf(diff) + " days ago";
        else if (diff < 365){
            diff/=30;
            if(diff == 1)
                days = String.valueOf(diff) + " month ago";
            else days = String.valueOf(diff) + " months ago";
        } else {
            diff/=365;
            if(diff == 1)
                days = String.valueOf(diff) + " year ago";
            else days = String.valueOf(diff) + " years ago";
        }
        return days;
    }
    
}
