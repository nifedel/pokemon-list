package com.example.poketlist.data.mappers.pokemonList

import com.example.poketlist.data.model.pokemonList.PokeListDTO
import com.example.poketlist.domain.model.pokemonList.PokeList

fun PokeListDTO.toDomain(): PokeList{
    return PokeList(
        count = count,
        next = next,
        previous = previous,
        results = resultsDTO.toDomain()
    )
}