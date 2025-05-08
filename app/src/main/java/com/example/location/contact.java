package com.example.location;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


import java.util.Comparator;

@Entity
public class contact {


    public String name;

    @NonNull
    @PrimaryKey(autoGenerate = false)
    public String num;

    Boolean ask;
    public contact(String num,String name, boolean ask){
        this.num=num;
        this.name = name;
        this.ask=false;
    }

    public String getName() {
        return name;
    }
    public String getNum() {
        return num;
    }
    public Boolean getAsk() {return ask;}

    static Comparator<contact> asc = Comparator.comparing(contact::getName);

    @Override
    public boolean equals(@Nullable Object obj) {
        contact t = (contact) obj;
        assert t != null;
        return name.equals(t.name);
    }
}