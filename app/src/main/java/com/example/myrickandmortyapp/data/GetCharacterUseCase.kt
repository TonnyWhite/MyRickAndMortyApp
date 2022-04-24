package com.example.myrickandmortyapp.data

import javax.inject.Inject

class GetCharacterUseCase @Inject constructor(
    private val repository: CharactersRepository){
    operator fun invoke(id: Int) = repository.getCharacterById(id)
}