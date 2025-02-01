package com.example.poketlist.data.model.pokemonInfo

import kotlinx.serialization.Serializable

@Serializable
data class Type(
    val name: String,
    val url: String
)