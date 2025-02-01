package com.example.poketlist.data.model.pokemonInfo

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AbilityDescription(
    val ability: Ability,
    @SerialName("is_hidden")
    val isHidden: Boolean,
    val slot: Int
)