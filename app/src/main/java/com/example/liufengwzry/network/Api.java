package com.example.liufengwzry.network;

import androidx.lifecycle.MutableLiveData;

import com.example.liufengwzry.database.Hero;
import com.example.liufengwzry.entitiy.News;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface Api {

    //@FormUrlEncoded
    @GET("db.json")
    Call<List<Hero>> get();   // 请求体味RequestBody 类型
}
