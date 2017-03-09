package com.hanbit.contactsapp.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.hanbit.contactsapp.domain.MemberBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hb2000 on 2017-03-08.
 */

public class DatabaseHelper extends SQLiteOpenHelper{
    final static String DATABASE_NAME="";
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql="";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Member");
        onCreate(db);
    }
    public void insert(MemberBean bean){

    }
    public MemberBean selectOne(MemberBean bean){
        MemberBean member = new MemberBean();
        return member;
    }
    public List<MemberBean> selectSome(MemberBean bean){
        List<MemberBean> list = new ArrayList<>();
        return list;
    }
    public List<MemberBean> selectAll(MemberBean bean){
        List<MemberBean> list = new ArrayList<>();
        return list;
    }
    public void update(MemberBean bean){

    }
    public void delete(MemberBean bean){

    }


}
