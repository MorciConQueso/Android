package com.example.administrador.basededatos;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
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
        return db;
    }

    public static SQLiteDatabase getConnectionWrite (Context context){
        DBHelper database = new DBHelper(context, DB_NAME,null,VERSION);
        SQLiteDatabase db = database.getWritableDatabase();
        return db;
    }

    public static long insert(Context context, String table, ContentValues values){
        long cantidadInserts = 0;
        SQLiteDatabase db = getConnectionWrite(context);
        db.beginTransaction();
        try{
            cantidadInserts = db.insert(table,null,values);
            db.setTransactionSuccessful();

        }catch (SQLException ex){
            ex.printStackTrace();
        }finally{
            db.endTransaction();
            db.close();
        }
        return cantidadInserts;
    }

    public static int update(Context context, String table,ContentValues values, String where,String[] whereArgs){
        int cantidadUpdate = 0;
        SQLiteDatabase db = getConnectionWrite(context);
        db.beginTransaction();
        try{
            cantidadUpdate = db.update(table,values,where,whereArgs);
            db.setTransactionSuccessful();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            db.endTransaction();
            db.close();
        }
        return cantidadUpdate;
    }

    public static long delete(Context context, String table,String where, String[] whereArgs){
        long cantidadDeletes = 0;
        SQLiteDatabase db = getConnectionWrite(context);
        db.beginTransaction();
        try{
            cantidadDeletes = db.delete(table,where,whereArgs);
            db.setTransactionSuccessful();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            db.endTransaction();
            db.close();
        }
        return cantidadDeletes;
    }
}
