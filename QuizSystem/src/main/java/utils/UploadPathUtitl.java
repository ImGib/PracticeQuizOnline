/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import jakarta.servlet.http.Part;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 *
 * @author Gib
 */
public class UploadPathUtitl {
    
    private static UploadPathUtitl instance = null;
    
    public static UploadPathUtitl getInstance (){
        if(instance == null){
            instance = new UploadPathUtitl();
        }
        return instance;
    }
    
    public void uploadPath(Part file, String path){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            InputStream is = file.getInputStream();
            
            byte[] data = new byte[is.available()];
            is.read(data);
            fos.write(data);
            fos.close();
        } catch (Exception e) {
        }
    }
}
