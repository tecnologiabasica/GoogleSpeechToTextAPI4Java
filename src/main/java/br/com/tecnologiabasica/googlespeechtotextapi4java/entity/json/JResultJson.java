/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tecnologiabasica.googlespeechtotextapi4java.entity.json;

import br.com.tecnologiabasica.googlespeechtotextapi4java.entity.JResult;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author afonso
 */
public class JResultJson {

    public static String getOutputEntityToJson(JResult entity) {
        Gson gson = new GsonBuilder().setExclusionStrategies(new JsonExcludeStrategy()).create();
        String output = gson.toJson(entity);
        return output;
    }
    
    public static JResult getOutputJsonToEntity(String json) {
        Gson gson = new GsonBuilder().setExclusionStrategies(new JsonExcludeStrategy()).create();
        JResult output = gson.fromJson(json, JResult.class);
        return output;
    }

    public static String getOutputListToJson(ArrayList<JResult> list) {
        Gson gson = new GsonBuilder().setExclusionStrategies(new JsonExcludeStrategy()).create();
        String output = gson.toJson(list);
        return output;
    }
    
    public static ArrayList<JResult> getOutputJsonToList(String json) {
        ArrayList<JResult> output = new ArrayList<>((ArrayList<JResult>) new Gson().fromJson(json,new TypeToken<List<JResult>>(){}.getType()));
        return output;
    }

}
