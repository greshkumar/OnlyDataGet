package com.example.greshkumartharwani.getandpost;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Gresh Kumar Tharwani on 12/29/2017.
 */

public class apiclient {
    public static Retrofit retrofit=null;
    public static Retrofit getretrofit(){ if (retrofit==null) {


        retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
        return retrofit;
    }
}
