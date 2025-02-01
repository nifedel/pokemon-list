package com.example.poketlist.data.model.pokemonList

import kotlinx.serialization.Serializable

@Serializable
data class Result(
    val name: String,
    val url: String
)