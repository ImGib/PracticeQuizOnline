/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.Part;
import java.io.IOException;

/**
 *
 * @author asus
 */
public class UpImgToGGUntil {

    public static String makeLink(Part file, HttpServletRequest req) throws IOException {
        String filename = file.getSubmittedFileName();
        String uploadPath = req.getServletContext().getRealPath("/asset/images/avatar");
        System.out.println("file part: " + uploadPath);
        file.write(uploadPath + "/" + filename);
        String img = "http://drive.google.com/uc?export=view&id=" + UpFileToDriveUtil.MakeLink(uploadPath + "/" + filename, "1gL05UORsV0WbxBknDlBi-L15QvSfdYYJ", null);
        return img;
    }
}
