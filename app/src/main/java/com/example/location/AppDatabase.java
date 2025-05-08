package com.example.location;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {contact.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract contactDB dao();
}
