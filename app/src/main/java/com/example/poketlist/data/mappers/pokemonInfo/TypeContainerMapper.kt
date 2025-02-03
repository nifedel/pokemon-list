package com.example.poketlist.data.mappers.pokemonInfo

import com.example.poketlist.data.model.pokemonInfo.TypeContainerDTO
import com.example.poketlist.domain.model.pokemonInfo.TypeContainer

fun TypeContainerDTO.toDomain(): TypeContainer{
    return TypeContainer(
        slot = slot,
        type = typeDTO.toDomain()
    )
}

fun List<TypeContainerDTO>.toDomain(): List<TypeContainer>{
    return this.map{ it.toDomain() }
}