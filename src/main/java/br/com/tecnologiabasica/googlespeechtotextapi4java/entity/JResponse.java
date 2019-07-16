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
public class JResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private ArrayList<JResult> results;

    public ArrayList<JResult> getResults() {
        return results;
    }

    public void setResults(ArrayList<JResult> results) {
        this.results = results;
    }

}
