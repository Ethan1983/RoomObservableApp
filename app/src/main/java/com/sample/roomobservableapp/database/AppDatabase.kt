package com.sample.roomobservableapp.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database( entities = [Item::class], exportSchema = false, version = 1 )
abstract class AppDatabase : RoomDatabase() {

    abstract fun itemDao() : ItemDao
}
