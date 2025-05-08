package com.example.location;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
@Dao
public interface contactDB {
    @Query("select * from contact")
    List<contact> ticked();

    @Insert
    void insertAll(contact... cons);
}

