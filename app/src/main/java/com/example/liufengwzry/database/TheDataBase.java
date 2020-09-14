package com.example.liufengwzry.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import static com.example.liufengwzry.App.getContext;


@Database(entities = {Hero.class},version = 1,exportSchema = false)
public abstract class TheDataBase extends RoomDatabase {

    private static TheDataBase instance;
    public abstract HeroDao heroDao();

    public static synchronized TheDataBase getInstance(){
        if(instance == null){
            instance= Room.databaseBuilder(getContext(),TheDataBase.class,"lfwzry").build();
        }
        return instance;
    }
}
