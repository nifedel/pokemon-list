package com.example.poketlist.data.model.pokemonInfo

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StatContainer(
    @SerialName("base_stat")
    val baseStatValue: Int,
    val effort: Int,
    val stat: Stat
)