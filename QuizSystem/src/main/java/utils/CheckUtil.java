/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author admin
 */
public class CheckUtil {
       
    public static void main(String[] args) {
        System.out.println(MD5Encryption("123"));
    }
    
    public String getDateNow(){
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sf.format(Calendar.getInstance().getTime());
        return date;
    }
    
    public boolean checkEmail(String email) {
        Pattern p = Pattern.compile("^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z]+(.[a-zA-Z]+)+$");
        if (p.matcher(email).find()) {
            return true;
        }
        return false;
    }

    public boolean checkName(String name) {
        Pattern p = Pattern.compile("^[a-zA-Z ]+$");
        if (p.matcher(name).find()) {
            return true;
        }
        return false;
    }

    public int createCheckCode() {
        int max = 9999;
        int min = 1000;
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static String MD5Encryption(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            return DatatypeConverter.printHexBinary(md.digest()).toLowerCase();
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public boolean checkPhone(String phone) {
        Pattern p = Pattern.compile("^[0-9]{10}$");
        if (p.matcher(phone).find()) {
            return true;
        }
        return false;
    }

    public boolean checkDate(String date) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date checkDate = df.parse(date);
        if (date.equalsIgnoreCase(df.format(checkDate))) {
            return true;
        }
        return false;
    }
    
    public boolean isContainSpace(String str){
        if(str.contains(" ")){
            return true;
        }
        return false;
    }
    
}
