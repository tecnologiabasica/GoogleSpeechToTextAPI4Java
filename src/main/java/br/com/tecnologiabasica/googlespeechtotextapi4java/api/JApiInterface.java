/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tecnologiabasica.googlespeechtotextapi4java.api;

import br.com.tecnologiabasica.googlespeechtotextapi4java.JApiSetup;
import br.com.tecnologiabasica.googlespeechtotextapi4java.entity.JRequest;
import br.com.tecnologiabasica.googlespeechtotextapi4java.entity.JResponse;
import java.util.Map;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/**
 * @author afonso
 */
public class JApiInterface {

    private static ApiInterface apiInterface;

    public static ApiInterface getGenericApiClient(String apiUrl) {
        if (apiInterface == null) {
            Retrofit client = JApiSetup.getApiClient(apiUrl);
            apiInterface = client.create(ApiInterface.class);
        }
        return apiInterface;
    }

    public interface ApiInterface {

        @POST("v1p1beta1/speech:recognize")
        Call<JResponse> recognize(@QueryMap Map<String, String> queryParam, @Body JRequest entity);

    }

}
