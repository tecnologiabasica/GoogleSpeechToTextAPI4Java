/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tecnologiabasica.googlespeechtotextapi4java.entity;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author afonso
 */
public class JResult implements Serializable {

    private static final long serialVersionUID = 1L;

    private ArrayList<JAlternative> alternatives;
    private String languageCode;

    public ArrayList<JAlternative> getAlternatives() {
        return alternatives;
    }

    public void setAlternatives(ArrayList<JAlternative> alternatives) {
        this.alternatives = alternatives;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

}
