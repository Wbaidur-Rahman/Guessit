package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel
class GameViewModel : ViewModel() {
    init {
        Log.i( tag: "GameViewModel", msg: "GameViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i(tag: "GameViewModel", msg: "Game")
    }
}

// TODO (02) Create the GameViewModel class, extending ViewModel
// TODO (03) Add init and override onCleared; Add log statements to both