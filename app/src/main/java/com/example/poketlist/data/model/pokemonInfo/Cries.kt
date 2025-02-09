package com.example.poketlist.data.model.pokemonInfo

import kotlinx.serialization.Serializable

@Serializable
data class Cries(
    val latest: String,
    val legacy: String
)