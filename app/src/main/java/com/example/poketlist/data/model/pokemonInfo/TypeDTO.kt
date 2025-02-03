package com.example.poketlist.data.model.pokemonInfo

import kotlinx.serialization.Serializable

@Serializable
data class TypeDTO(
    val name: String,
    val url: String
)