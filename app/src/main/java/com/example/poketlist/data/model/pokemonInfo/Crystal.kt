package com.example.poketlist.data.model.pokemonInfo

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Crystal(
    @SerialName("front_default")
    val frontDefault: String
)