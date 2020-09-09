package com.example.liufengwzry.base;


import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        Go();
        InitVMAndObserve();
    }
    protected void Go(){

    }
    protected int getLayout(){
        return 0;
    }
    protected void InitVMAndObserve(){

    }
}
