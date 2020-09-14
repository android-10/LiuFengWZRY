package com.example.liufengwzry.repository;

import com.example.liufengwzry.database.Hero;
import com.example.liufengwzry.database.HeroDao;
import com.example.liufengwzry.database.TheDataBase;
import com.example.liufengwzry.network.Client;
import com.example.liufengwzry.ui.gallery.GalleryViewModel;
import com.example.liufengwzry.util.Util;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HeroRepository {

    private static HeroDao heroDao;
    private static HeroRepository heroRepository;
    public static HeroRepository getInstance(){
        if(heroRepository==null){
            heroRepository=new HeroRepository();
        }
        if(heroDao==null){
            heroDao= TheDataBase.getInstance().heroDao();
        }
        return heroRepository;
    }
    public void loadHeros(GalleryViewModel vm){
        Util.excute(()->{
            if(heroDao.getAllHeros()!=null&&heroDao.getAllHeros().size()>0){
                vm.getHeros().postValue(heroDao.getAllHeros());
            }else{
                Client.create().get(new Callback<List<Hero>>() {
                    @Override
                    public void onResponse(Call<List<Hero>> call, Response<List<Hero>> response) {
                        if(response.isSuccessful()){
                            vm.getHeros().setValue(response.body());
                            Util.excute(()->{
                                heroDao.insertHeros(response.body());
                            });
                        }
                    }
                    @Override
                    public void onFailure(Call<List<Hero>> call, Throwable t) {
                        Util.e("loadheros+"+t.toString());
                    }
                });
            }
        });
    }
}
