/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tecnologiabasica.googlespeechtotextapi4java;

import br.com.tecnologiabasica.googlespeechtotextapi4java.api.JApiController;
import br.com.tecnologiabasica.googlespeechtotextapi4java.entity.JAudio;
import br.com.tecnologiabasica.googlespeechtotextapi4java.entity.JConfig;
import br.com.tecnologiabasica.googlespeechtotextapi4java.entity.JRequest;
import br.com.tecnologiabasica.googlespeechtotextapi4java.entity.JResponse;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author afonso
 */
public class GoogleSpeechToTextAPI {

    private int statusCode = -1;
    private String message = null;
    private double confidence = -1;

    public String getMessage() {
        return message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public double getConfidence() {
        return confidence;
    }

    public String recognize(String base64File, String encoding, String sampleRateHertz, String languageCode) {
        String returnValue = null;
        JResponse response = null;
        Map<String, String> queryParam = new HashMap<>();
        queryParam.put("key", JCommons.getInstance().getApiKey());

        JRequest request = new JRequest();
        JAudio audio = new JAudio();
        JConfig config = new JConfig();
        audio.setContent(base64File);
        config.setEncoding(encoding);
        config.setSampleRateHertz(sampleRateHertz);
        config.setLanguageCode(languageCode);

        request.setAudio(audio);
        request.setConfig(config);

        JApiController apiController = new JApiController(JCommons.getInstance().getApiUrl());
        response = apiController.recognize(queryParam, request, null);
        statusCode = apiController.getResponseCode();
        message = apiController.getResponseMessage();
        if (response != null) {
            returnValue = response.getResults().get(0).getAlternatives().get(0).getTranscript();
            confidence = response.getResults().get(0).getAlternatives().get(0).getConfidence();
        }
        return returnValue;
    }
}
