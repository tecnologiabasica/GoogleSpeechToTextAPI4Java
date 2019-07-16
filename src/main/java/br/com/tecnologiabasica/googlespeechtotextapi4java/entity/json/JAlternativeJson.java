/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tecnologiabasica.googlespeechtotextapi4java.entity.json;

import br.com.tecnologiabasica.googlespeechtotextapi4java.entity.JAlternative;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author afonso
 */
public class JAlternativeJson {

    public static String getOutputEntityToJson(JAlternative entity) {
        Gson gson = new GsonBuilder().setExclusionStrategies(new JsonExcludeStrategy()).create();
        String output = gson.toJson(entity);
        return output;
    }
    
    public static JAlternative getOutputJsonToEntity(String json) {
        Gson gson = new GsonBuilder().setExclusionStrategies(new JsonExcludeStrategy()).create();
        JAlternative output = gson.fromJson(json, JAlternative.class);
        return output;
    }

    public static String getOutputListToJson(ArrayList<JAlternative> list) {
        Gson gson = new GsonBuilder().setExclusionStrategies(new JsonExcludeStrategy()).create();
        String output = gson.toJson(list);
        return output;
    }
    
    public static ArrayList<JAlternative> getOutputJsonToList(String json) {
        ArrayList<JAlternative> output = new ArrayList<>((ArrayList<JAlternative>) new Gson().fromJson(json,new TypeToken<List<JAlternative>>(){}.getType()));
        return output;
    }

}
