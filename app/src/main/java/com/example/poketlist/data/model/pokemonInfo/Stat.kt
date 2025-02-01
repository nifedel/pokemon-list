package com.example.poketlist.data.model.pokemonInfo

import kotlinx.serialization.Serializable

@Serializable
data class Stat(
    val name: String,
    val url: String
)