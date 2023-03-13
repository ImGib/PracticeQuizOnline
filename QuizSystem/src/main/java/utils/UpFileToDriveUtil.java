/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import Java.googleapi.CreateGoogleFile;
import static Java.googleapi.CreateGoogleFile.createGoogleFile;
import com.google.api.services.drive.model.File;
import java.io.IOException;

/**
 *
 * @author asus
 */
public class UpFileToDriveUtil {
    
    
    public static String MakeLink(String url,String idParentFile,String name) throws IOException{
        CreateGoogleFile gg=new CreateGoogleFile();
        java.io.File uploadFile = new java.io.File(url);
        File googleFile = gg.createGoogleFile(idParentFile, null, name, uploadFile);
        return googleFile.getId();
    }
    
}
