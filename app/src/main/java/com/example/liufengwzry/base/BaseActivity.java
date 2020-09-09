package com.example.liufengwzry.base;


import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.viewbinding.ViewBinding;

import butterknife.ButterKnife;

public class BaseActivity<M extends ViewModel,B extends ViewBinding>  extends AppCompatActivity {


    protected M InitVM(){
        return null;
    }
    protected M vm;
    protected B bind;

    protected B InitBinding(){
        return null;
    };
    protected int getLayout(){
        return 0;
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(InitBinding()==null){
            setContentView(getLayout());
            ButterKnife.bind(this);
        }else{
            bind=InitBinding();
            setContentView(bind.getRoot());
            Observe();
        }
        Go();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bind=null;
    }

    protected void Go(){

    }
    protected void Observe(){

    }
}
