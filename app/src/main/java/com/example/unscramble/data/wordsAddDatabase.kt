package com.example.unscramble.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [wordsAdd::class], version = 1)
abstract class wordsAddDatabase : RoomDatabase(){
    abstract fun wordsDao(): wordsDao

    companion object {
        @Volatile
        private var INSTANCE:wordsAddDatabase? = null
        fun getInstance(context: Context): wordsAddDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    wordsAddDatabase::class.java,
                    "word_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}