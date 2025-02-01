package com.example.poketlist.data.model.pokemonInfo

import kotlinx.serialization.Serializable

@Serializable
data class GenerationIi(
    val crystal: Crystal,
    val gold: Gold,
    val silver: Silver
)