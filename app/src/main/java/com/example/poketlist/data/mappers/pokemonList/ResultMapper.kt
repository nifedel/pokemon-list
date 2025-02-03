package com.example.poketlist.data.mappers.pokemonList

import com.example.poketlist.data.model.pokemonList.ResultDTO
import com.example.poketlist.domain.model.pokemonList.Result

fun ResultDTO.toDomain(): Result{
    return Result(
        name = name,
        url = url
    )
}

fun List<ResultDTO>.toDomain(): List<Result>{
    return this.map { it.toDomain() }
}