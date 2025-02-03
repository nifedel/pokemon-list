package com.example.poketlist.data.mappers.pokemonInfo

import com.example.poketlist.data.model.pokemonInfo.PokeInfoDTO
import com.example.poketlist.domain.model.pokemonInfo.PokeInfo

fun PokeInfoDTO.toDomain(): PokeInfo {
    return PokeInfo(
        id = id,
        name = name,
        typeContainers = typeContainersDTO.toDomain(),
        sprites = spritesDTO.toDomain(),
        baseExperience = baseExperience,
        statContainers = statContainersDTO.toDomain()
    )
}