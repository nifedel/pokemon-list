package com.example.poketlist.data.model.pokemonInfo

import kotlinx.serialization.Serializable

@Serializable
data class TypeContainerDTO(
    val slot: Int,
    val typeDTO: TypeDTO
)