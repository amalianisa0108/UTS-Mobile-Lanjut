package com.example.unscramble.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

@Dao
interface wordsDao {

    @Insert
    suspend fun insertWord(word : wordsAdd)

    @Query("SELECT * FROM words")
    fun getAllWords(): Flow<List<wordsAdd>>
}