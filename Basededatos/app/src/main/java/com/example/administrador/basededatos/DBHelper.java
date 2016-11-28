package com.example.administrador.basededatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.SQLClientInfoException;

/**
 * Created by Administrador on 28/11/2016.
 */

public class DBHelper extends SQLiteOpenHelper {
    String sqlUsuario = "CREATE TABLE Usuarios (codigo INTEGER, nombre TEXT)";

    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sqlUsuario);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS Usuarios");
        db.execSQL(sqlUsuario);
    }
}
