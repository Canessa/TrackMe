package com.example.practicaexamen.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AdminDB extends SQLiteOpenHelper {
    public AdminDB(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    //Se ejecuta una UNICA vez... cuando se crea la base de datos...
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table Fitness (id int primary key, mes text, peso double, masamuscular double, masagrasa double, imc double, grasacoorporal double, viceral double)");
    }

    //Se ejecuta una cada vez que se cambia la version de la base de datos
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("create table Fitness (id int primary key, mes text, peso double, masamuscular double, masagrasa double, imc double, grasacoorporal double, viceral double)");
    }
}
