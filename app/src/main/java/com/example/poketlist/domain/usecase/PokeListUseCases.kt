package com.example.poketlist.domain.usecase

import com.example.poketlist.domain.model.pokemonList.PokeList
import com.example.poketlist.domain.model.pokemonList.Result
import com.example.poketlist.domain.repository.pokeList.PokeListRepository

class GetPokeListUseCase(private val repository: PokeListRepository){
    suspend operator fun invoke(): PokeList{
        return repository.getPokeList()
    }
}

class GetResult(private val repository: PokeListRepository){
    suspend operator fun invoke(id: Int): Result {
        return repository.getResult(id)
    }
}