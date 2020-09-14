package com.example.liufengwzry.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.liufengwzry.database.Hero;
import com.example.liufengwzry.network.Client;
import com.example.liufengwzry.repository.HeroRepository;
import com.example.liufengwzry.util.Util;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<List<Hero>> heros=new MutableLiveData<List<Hero>>();


    public MutableLiveData<List<Hero>> getHeros() {
        return heros;
    }
    public void loadHeros(){
        HeroRepository.getInstance().loadHeros(this);
    }
}