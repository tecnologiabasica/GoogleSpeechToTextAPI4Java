/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tecnologiabasica.googlespeechtotextapi4java.entity.json;

import br.com.tecnologiabasica.googlespeechtotextapi4java.entity.JConfig;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author afonso
 */
public class JConfigJson {

    public static String getOutputEntityToJson(JConfig entity) {
        Gson gson = new GsonBuilder().setExclusionStrategies(new JsonExcludeStrategy()).create();
        String output = gson.toJson(entity);
        return output;
    }
    
    public static JConfig getOutputJsonToEntity(String json) {
        Gson gson = new GsonBuilder().setExclusionStrategies(new JsonExcludeStrategy()).create();
        JConfig output = gson.fromJson(json, JConfig.class);
        return output;
    }

    public static String getOutputListToJson(ArrayList<JConfig> list) {
        Gson gson = new GsonBuilder().setExclusionStrategies(new JsonExcludeStrategy()).create();
        String output = gson.toJson(list);
        return output;
    }
    
    public static ArrayList<JConfig> getOutputJsonToList(String json) {
        ArrayList<JConfig> output = new ArrayList<>((ArrayList<JConfig>) new Gson().fromJson(json,new TypeToken<List<JConfig>>(){}.getType()));
        return output;
    }

}
