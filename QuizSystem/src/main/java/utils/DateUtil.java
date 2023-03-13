/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author asus
 */
public class DateUtil {
    static Date date=new Date();
    static SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");

    public static String getDate(){
        return ft.format(date).toString();
    }
}
