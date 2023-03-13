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
    public static void main(String[] args) throws IOException {
        String url="C:\\Users\\Gib\\OneDrive\\Pictures\\313198147_1519400735188075_8799590576274760576_n.jpg";
        String idParent="1gL05UORsV0WbxBknDlBi-L15QvSfdYYJ";
        String str= UpFileToDriveUtil.MakeLink(url,idParent,"test");
        System.out.println(str);
    }
    
}
