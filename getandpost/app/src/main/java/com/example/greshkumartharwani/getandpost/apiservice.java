package com.example.greshkumartharwani.getandpost;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Gresh Kumar Tharwani on 12/29/2017.
 */

public interface apiservice {
    @GET("posts")
    Call<ArrayList<model>> gresh();

}
