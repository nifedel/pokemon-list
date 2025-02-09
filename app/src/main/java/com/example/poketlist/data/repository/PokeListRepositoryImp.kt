package com.example.poketlist.data.repository

import com.example.poketlist.data.api.PokeListAPI
import com.example.poketlist.data.mappers.pokemonList.toDomain
import com.example.poketlist.domain.model.pokemonList.PokeList
import com.example.poketlist.domain.model.pokemonList.Result
import com.example.poketlist.domain.repository.pokeList.PokeListRepository

class PokeListRepositoryImp(private val api: PokeListAPI): PokeListRepository {
    override suspend fun getPokeList(): PokeList {
        return api.getPokeList().toDomain()
    }

    override suspend fun getResult(id: Int): Result {
        TODO("Not yet implemented")
    }

}