/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tecnologiabasica.googlespeechtotextapi4java.entity;

import java.io.Serializable;

/**
 *
 * @author afonso
 */
public class JAudio implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String content;

    public JAudio() {
        this.content = null;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
