package com.example.myrickandmortyapp.data

import androidx.lifecycle.LiveData

interface CharactersRepository {

    fun getCharactersList(): LiveData<List<Character>>

    fun getCharacterById(id: Int): LiveData<Character>
}