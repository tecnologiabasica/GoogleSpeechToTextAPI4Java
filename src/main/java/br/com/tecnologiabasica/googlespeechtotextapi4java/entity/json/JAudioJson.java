/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tecnologiabasica.googlespeechtotextapi4java.entity.json;

import br.com.tecnologiabasica.googlespeechtotextapi4java.entity.JAudio;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author afonso
 */
public class JAudioJson {

    public static String getOutputEntityToJson(JAudio entity) {
        Gson gson = new GsonBuilder().setExclusionStrategies(new JsonExcludeStrategy()).create();
        String output = gson.toJson(entity);
        return output;
    }
    
    public static JAudio getOutputJsonToEntity(String json) {
        Gson gson = new GsonBuilder().setExclusionStrategies(new JsonExcludeStrategy()).create();
        JAudio output = gson.fromJson(json, JAudio.class);
        return output;
    }

    public static String getOutputListToJson(ArrayList<JAudio> list) {
        Gson gson = new GsonBuilder().setExclusionStrategies(new JsonExcludeStrategy()).create();
        String output = gson.toJson(list);
        return output;
    }
    
    public static ArrayList<JAudio> getOutputJsonToList(String json) {
        ArrayList<JAudio> output = new ArrayList<>((ArrayList<JAudio>) new Gson().fromJson(json,new TypeToken<List<JAudio>>(){}.getType()));
        return output;
    }

}
