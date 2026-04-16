package com.example.unscramble.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [wordsAdd::class], version = 1)
abstract class wordsAddDatabase : RoomDatabase(){
    abstract fun wordsDao(): wordsDao
}