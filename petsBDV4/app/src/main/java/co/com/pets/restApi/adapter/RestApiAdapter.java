package co.com.pets.restApi.adapter;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import co.com.pets.restApi.ConstantesRestApi;
import co.com.pets.restApi.EndpointsApi;
import co.com.pets.restApi.deserializador.MascotaDeserializador;
import co.com.pets.restApi.model.MascotaResponse;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by xander on 27/02/2017.
 */

public class RestApiAdapter {


    public EndpointsApi establecerConexionRestApiInstagram(Gson gson){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConstantesRestApi.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        return retrofit.create(EndpointsApi.class);

    }

    public  Gson construyeGsonDeserializadorMediaRecent(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(MascotaResponse.class, new MascotaDeserializador());

        return gsonBuilder.create();

    }

}
