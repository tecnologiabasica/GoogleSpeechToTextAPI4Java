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
public class JRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private JAudio audio = null;
    private JConfig config = null;

    public JAudio getAudio() {
        return audio;
    }

    public void setAudio(JAudio audio) {
        this.audio = audio;
    }

    public JConfig getConfig() {
        return config;
    }

    public void setConfig(JConfig config) {
        this.config = config;
    }

}
