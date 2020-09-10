package com.example.liufengwzry.network;

import com.example.liufengwzry.entitiy.News;
import com.example.liufengwzry.util.Util;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {
    private static Retrofit retrofit;
    private static String Url="https://jsonplaceholder.typicode.com/";
    private static Api api;
    public static Client create(){
        Client client=new Client();

        retrofit=new Retrofit.Builder().baseUrl("https://github.com/anizwel/LiuFengWZRY/releases/download/db/").addConverterFactory(GsonConverterFactory.create()).build();

        api = retrofit.create(Api.class);

        return client;
    }
    public void get(Callback callBack){

        api.get().enqueue(callBack);
    }
}
