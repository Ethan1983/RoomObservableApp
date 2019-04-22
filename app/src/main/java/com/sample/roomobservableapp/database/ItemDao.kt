package com.sample.roomobservableapp.database

import androidx.room.Dao
import androidx.room.Query
import io.reactivex.Observable

@Dao
interface ItemDao {

    @Query( "SELECT * FROM item" )
    fun getItems() : Observable<List<Item>>

}
