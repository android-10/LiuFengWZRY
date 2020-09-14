package com.example.liufengwzry.util;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.example.liufengwzry.database.Hero;

import java.util.List;

import static com.example.liufengwzry.App.getContext;

public class Util {
    private static Context context=getContext();
    public static void t(Object o){
        Toast.makeText(context,o.toString(),Toast.LENGTH_LONG).show();
    }
    public static void e(Object o){
        Log.e("wilyn",o.toString());
    }
    public static void excute(Runnable runnable){
        new Thread(runnable).start();
    }
}
