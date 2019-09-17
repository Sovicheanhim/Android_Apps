package com.example.database

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
val DB_NAME = "Student"
val TABLE_NAME = "Staff"
val COLUMN1 = "City"
val COLUMN2 = "Name"
class MyHelper(context: Context):SQLiteOpenHelper(context, DB_NAME, null, 1){
    override fun onCreate(p0: SQLiteDatabase?) {
        var createTable = "create table $TABLE_NAME($COLUMN1 varchar(250), $COLUMN2 varchar(250))"
        p0?.execSQL(createTable)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun saveData(dto:Staff):Long{
        var cv = ContentValues()
        cv.put(COLUMN1, dto.city)
        cv.put(COLUMN2, dto.name)

        var db = this.writableDatabase
        var res = db.insert(TABLE_NAME, null, cv)
        return res
    }
}
