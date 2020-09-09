package com.example.liufengwzry.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


@Database(entities = {Hero.class},version = 1,exportSchema = false)
public abstract class TheDataBase extends RoomDatabase {

    private static TheDataBase instance;
    public static HeroDao heroDao;

    public static synchronized TheDataBase getInstance(Context context){
        if(instance == null){
            instance= Room.databaseBuilder(context,TheDataBase.class,"lfwzry").build();
        }
        return instance;
    }
}
