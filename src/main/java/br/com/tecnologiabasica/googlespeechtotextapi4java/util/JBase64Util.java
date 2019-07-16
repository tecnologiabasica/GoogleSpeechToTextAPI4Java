/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tecnologiabasica.googlespeechtotextapi4java.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;

/**
 *
 * @author afonso
 */
public class JBase64Util {

    public static String getFileAsBase64(String filePath) throws IOException, FileNotFoundException {
        return getFileAsBase64(new File(filePath));
    }

    public static String getFileAsBase64(File file) throws IOException, FileNotFoundException {
        String fileAsBase64 = null;
        FileInputStream inputStream = new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        inputStream.read(bytes);
        fileAsBase64 = Base64.getEncoder().encodeToString(bytes);
        return fileAsBase64;
    }

    public static String getFileAsBase64(byte[] bytes) {
        return Base64.getEncoder().encodeToString(bytes);
    }

}
