package com.sample.roomobservableapp.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Item (
    @PrimaryKey(autoGenerate=true) val id : Int,
    val name : String,
    val number : Int )