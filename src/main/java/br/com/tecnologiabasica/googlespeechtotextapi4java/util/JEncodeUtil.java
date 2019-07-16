/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tecnologiabasica.googlespeechtotextapi4java.util;

import java.io.IOException;

/**
 *
 * @author afonso
 */
public class JEncodeUtil {

    public static String encodeFileToFlac(String filePath) throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        String path = "sox " + filePath + " --rate 8k --bits 16 --channels 1 " + filePath + ".flac";
        Process process = rt.exec(path);
        process.waitFor();
        return filePath + ".flac";
    }
  
}
