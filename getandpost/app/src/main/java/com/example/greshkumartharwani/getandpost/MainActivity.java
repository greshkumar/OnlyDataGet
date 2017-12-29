package com.example.greshkumartharwani.getandpost;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<model>list;
    Context con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        con=this;

        recyclerView = (RecyclerView)findViewById(R.id.kumar);
        list= new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        filldata();
    }
    public void filldata(){
        apiservice obj = apiclient.getretrofit().create(apiservice.class);
        Call<ArrayList<model>> call=obj.gresh();
        call.enqueue(new Callback<ArrayList<model>>() {
            @Override
            public void onResponse(Call<ArrayList<model>> call, Response<ArrayList<model>> response) {
                list=response.body();
                recyclerView.setAdapter(new recycleradapter(list, con));
            }

            @Override
            public void onFailure(Call<ArrayList<model>> call, Throwable t) {

            }
        });

    }
}
