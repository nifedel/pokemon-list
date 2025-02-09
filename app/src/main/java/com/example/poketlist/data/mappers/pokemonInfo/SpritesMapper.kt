package com.example.poketlist.data.mappers.pokemonInfo

import com.example.poketlist.data.model.pokemonInfo.SpritesDTO
import com.example.poketlist.domain.model.pokemonInfo.Sprites

fun SpritesDTO.toDomain(): Sprites{
    return Sprites(
        frontDefault = frontDefault
    )
}