package com.example.my_instagram;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DB="login.db";
    public DBHelper( Context context) {

        super(context, "login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create TABLE GIRIS(username VARCHAR PRİMARY KEY, password VARCHAR)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists GIRIS");

    }

    public Boolean insertData(String username,String password){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("username", username);
        values.put("password", password);

        long result = db.insert("GIRIS", null,values);
        if(result == -1 ) return false;
        else
            return true;


    }
    public Boolean checkUsername(String username){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("Select * from GIRIS where username=? ", new String[] {username});
        if(cursor.getCount()>0)
            return true;
        else
            return false;

    }
    public Boolean checkusernamepassword(String username, String password){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from GIRIS where username =? and password=?", new String[] {username,password});
        if (cursor.getCount()>0)
            return true;
        else
            return false;

    }



}
