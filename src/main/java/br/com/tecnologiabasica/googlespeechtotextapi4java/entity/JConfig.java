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
public class JConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    private boolean enableAutomaticPunctuation = true;
    private String encoding = null;
    private String sampleRateHertz = null;
    private String languageCode = null;
    private String model = "default";

    public boolean isEnableAutomaticPunctuation() {
        return enableAutomaticPunctuation;
    }

    public void setEnableAutomaticPunctuation(boolean enableAutomaticPunctuation) {
        this.enableAutomaticPunctuation = enableAutomaticPunctuation;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getSampleRateHertz() {
        return sampleRateHertz;
    }

    public void setSampleRateHertz(String sampleRateHertz) {
        this.sampleRateHertz = sampleRateHertz;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
