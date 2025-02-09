package com.example.poketlist.domain.repository.pokeList

import com.example.poketlist.domain.model.pokemonList.PokeList
import com.example.poketlist.domain.model.pokemonList.Result



interface PokeListRepository {
    suspend fun getPokeList(): PokeList
    suspend fun getResult(id: Int): Result
    //TODO if necessary add other functions
}