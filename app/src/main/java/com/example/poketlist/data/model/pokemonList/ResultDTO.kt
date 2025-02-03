package com.example.poketlist.data.model.pokemonList

import kotlinx.serialization.Serializable

@Serializable
data class ResultDTO(
    val name: String,
    val url: String
)