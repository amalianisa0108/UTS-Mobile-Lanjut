package com.example.unscramble.data

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.unscramble.ui.GameViewModel


class GameViewModelFactory(private val wordsDao: wordsDao) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(GameViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return GameViewModel(wordsDao) as T
        }
        throw IllegalArgumentException("Unkown ViewModel Class")

    }

}