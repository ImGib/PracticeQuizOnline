/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import jakarta.servlet.http.HttpServletRequest;

/**
 *
 * @author Lenovo
 */
public class SessionUtil {
    
    private static SessionUtil instance = null;
    
    public static SessionUtil getInstance (){
        if(instance == null){
            instance = new SessionUtil();
        }
        return instance;
    }
    
    public void putValue(HttpServletRequest request, String key, Object value){
        request.getSession().setAttribute(key, value);
    }
    
    public Object getValue(HttpServletRequest request, String key){
        return request.getSession().getAttribute(key);
    }
    
    public void removeValue(HttpServletRequest request, String key){
        request.getSession().removeAttribute(key);
    }
}
