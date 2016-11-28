package com.example.administrador.basededatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Administrador on 28/11/2016.
 */

public class ConnectionDB {
    private static String DB_NAME = "prueba.db";
    private static int VERSION = 1;

    public static SQLiteDatabase getConnectionQuery(Context context){
        DBHelper database = new DBHelper(context,DB_NAME,null,VERSION);
        SQLiteDatabase db = database.getReadableDatabase();
    }
}
