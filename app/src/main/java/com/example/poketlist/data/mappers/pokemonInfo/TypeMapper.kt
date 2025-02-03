package com.example.poketlist.data.mappers.pokemonInfo

import com.example.poketlist.data.model.pokemonInfo.TypeDTO
import com.example.poketlist.domain.model.pokemonInfo.Type

fun TypeDTO.toDomain(): Type {
    return Type(
        name = name,
        url = url
    )
}