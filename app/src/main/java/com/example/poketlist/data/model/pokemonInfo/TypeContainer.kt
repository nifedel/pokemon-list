package com.example.poketlist.data.model.pokemonInfo

import kotlinx.serialization.Serializable

@Serializable
data class TypeContainer(
    val slot: Int,
    val type: Type
)