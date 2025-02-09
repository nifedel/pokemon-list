package com.example.poketlist.data.mappers.pokemonInfo

import com.example.poketlist.data.model.pokemonInfo.StatContainerDTO
import com.example.poketlist.domain.model.pokemonInfo.StatContainer

fun StatContainerDTO.toDomain(): StatContainer{
    return StatContainer(
        baseStatValue = baseStatValue,
        effort = effort,
        stat = statDTO.toDomain()
    )
}

fun List<StatContainerDTO>.toDomain(): List<StatContainer>{
    return this.map{ it.toDomain() }
}