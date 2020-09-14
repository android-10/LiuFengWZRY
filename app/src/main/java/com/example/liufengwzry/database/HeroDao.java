package com.example.liufengwzry.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface HeroDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertHeros(List<Hero> heroes);



    @Query("SELECT * FROM hero")
    List<Hero> getAllHeros();
}
