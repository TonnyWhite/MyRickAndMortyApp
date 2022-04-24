package com.example.myrickandmortyapp.data

import javax.inject.Inject

class GetCharactersListUseCase @Inject constructor(
    private val repository: CharactersRepository){
    operator fun invoke() = repository
}