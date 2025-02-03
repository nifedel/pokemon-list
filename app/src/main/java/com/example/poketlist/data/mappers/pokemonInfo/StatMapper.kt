package com.example.poketlist.data.mappers.pokemonInfo

import com.example.poketlist.data.model.pokemonInfo.StatDTO
import com.example.poketlist.domain.model.pokemonInfo.Stat

fun StatDTO.toDomain(): Stat {
    return Stat(
        name = name,
        url = url
    )
}